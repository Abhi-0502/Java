package com.xworkz.newyear.services;

import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.entity.UserEntity;
import com.xworkz.newyear.reposisteory.UserReposisteoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServicesImpl implements UserServices{
    @Autowired
    private UserReposisteoryImpl reposistoery;
    @Autowired
    private  MailServices mailServices;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean validateAndSignIn(UserDto userDto) {
        if (reposistoery.findByEmail(userDto.getEmail())){
            return false;
        }else {
            UserEntity userEntity = new UserEntity();
            userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
            BeanUtils.copyProperties(userDto,userEntity);
            userEntity.setCreatedBy(userDto.getFirstName());
            if (reposistoery.Save(userEntity)){
                log.info("ValidateAndSignIn is added Successfully");
                mailServices.sendRegistrationMessage("Registration","Thank You For Registering",userDto.getEmail());

            }
            return true;
        }
    }
    @Override
    public boolean resetPassword(String email, String newPassword, String confirmPwd) {
        if (newPassword == null || confirmPwd == null || !newPassword.equals(confirmPwd)) {
            log.error("Password and Confirm Password do not match or are null");
            return false;
        }
        if (!reposistoery.findByEmail(email)) {
            log.error("Email not found");
            return false;
        }
        return reposistoery.updatePassword(email, newPassword,confirmPwd);
    }

//    @Override
//    public String signIn(String email, String password) {
//        UserEntity userEntity = reposistoery.findByEmailAndPassword(email, password);
//
//        if (userEntity != null &&
//                userEntity.getEmail() != null &&
//                userEntity.getEmail().equalsIgnoreCase(email) &&
//                userEntity.getPassword() != null &&
//                userEntity.getPassword().equals(password)) {
//            return "dashboard";
//        } else {
//            return "signIn";
//        }
//    }

    @Override
    public UserDto signIn(String email, String password) {
        UserDto userDto =new UserDto();
        UserEntity userEntity = reposistoery.findByEmailAndPassword(email, password);

        if (userEntity != null &&
                userEntity.getEmail() != null &&
                userEntity.getEmail().equalsIgnoreCase(email) &&
                userEntity.getPassword() != null &&
                userEntity.getPassword().equals(password)) {
            BeanUtils.copyProperties(userEntity,userDto);
            return userDto;
        } else {
            return userDto;
        }
    }

    @Override
    public UserDto getByEmail(String email) {
        UserDto userDto = new UserDto();
        UserEntity userEntity = reposistoery.checkEmail(email);
        BeanUtils.copyProperties(userEntity,userDto);
        return userDto;

    }

    @Override
    public boolean updateProfileData(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto,userEntity);
        return reposistoery.updateDate(userEntity);
    }


}

