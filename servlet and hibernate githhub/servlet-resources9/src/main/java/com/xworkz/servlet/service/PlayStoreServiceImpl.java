package com.xworkz.servlet.service;

import com.xworkz.servlet.dao.PlayStoreDao;
import com.xworkz.servlet.dao.PlayStoreDaoImpl;
import com.xworkz.servlet.dto.PlayStoreDto;

public class PlayStoreServiceImpl implements PlayStoreService {

    boolean userAdded = false;

    PlayStoreDao playStoreDao = new PlayStoreDaoImpl();
    @Override
    public boolean validateAndSavePassport(PlayStoreDto playStoreDto) {
        if (playStoreDto != null) {
            boolean UserNameValid = false;
            boolean emailValid = false;

            // Validate given name
            if (playStoreDto.getUserName() != null && !playStoreDto.getSurName().isEmpty()) {
                System.out.println("User first name valid");
                UserNameValid = true;
            }

            // Validate email
            if (playStoreDto.getEmail() != null && !playStoreDto.getEmail().isEmpty()) {
                System.out.println("User email valid");
                emailValid = true;
            }

            // Check if both fields are valid
            if (UserNameValid && emailValid) {
                userAdded =playStoreDao.addPlayStore(playStoreDto);
                System.out.println("service info :" + playStoreDto);
                if (userAdded) {
                    System.out.println("All fields are validated successfully and user added.");
                } else {
                    System.out.println("Validation passed");
                }
            } else {
                System.out.println("Validation failed. Ensure both given name and email are valid.");
            }
        } else {
            System.out.println("Passport data is null. Validation failed.");
        }
        return userAdded;
    }

    }

