package com.xworkz.newyear.services;

import com.xworkz.newyear.entity.UserEntity;
import com.xworkz.newyear.reposisteory.UserReposisteory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AjaxServicesImpl implements AjaxServices{


    @Autowired
    private UserReposisteory userReposisteory;

    @Override
    public String checkEmail(String email) {
       boolean exists = userReposisteory.findByEmail(email);
        System.out.println(exists);
       if(exists){
           return "email exists";
       }
        return "email does not exists";
    }

    @Override
    public String checkPhone(Long contact) {
        boolean exists = userReposisteory.checkPhone(contact);
        System.out.println(exists);
        if (exists){
            return "phoneNumber exists";
        }
        return "phoneNumber Does not exists";
    }
}
