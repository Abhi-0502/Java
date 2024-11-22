package com.xworkz.userdetails.services;

import com.xworkz.userdetails.dao.UserDao;
import com.xworkz.userdetails.dao.UserDaoImpl;
import com.xworkz.userdetails.dto.UserDto;
import com.xworkz.userdetails.services.UserServices;

public class UserServiceImpl implements UserServices {

    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean validateAndSaveUserDetails(UserDto userDto) {
        boolean userNameValid = false;
        boolean email = false;
        boolean userDetailsStored = false;
        UserDao userDao = new UserDaoImpl();

        if (userDto != null) {
            if (userDto.getFirstName() != null && !userDto.getLastName().isEmpty()) {
                System.out.println("UserName is validated!!.......");
                userNameValid = true;
            }
            if (userDto.getEmail() != null && !userDto.getEmail().isEmpty()) {
                System.out.println("UserLastName is validated!!.......");
                email = true;
            }
        }
        if (userNameValid == true && email == true) {
            userDetailsStored = userDao.addUserDetails(userDto);
        }
        return userDetailsStored;
    }

    @Override
    public void addUser(UserDto userDto) {
            if (userDto != null)
                System.out.println("user added");
            else
                System.out.println("Not added");
            userDao.addUserDetails(userDto);
        }
    }



