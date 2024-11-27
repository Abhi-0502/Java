package com.xworkz.servlet.service;

import com.xworkz.servlet.dao.PassportDao;
import com.xworkz.servlet.dao.PassportDaoImpl;
import com.xworkz.servlet.dto.PassportDto;

public class PassportServicesImpl implements PassportService{

    boolean userAdded = false;

    PassportDao passportDao = new PassportDaoImpl();
    @Override
    public boolean validateAndSavePassport(PassportDto passportDto) {

        if (passportDto != null) {
            boolean givenNameValid = false;
            boolean emailValid = false;

            // Validate given name
            if (passportDto.getGivenName() != null && !passportDto.getGivenName().isEmpty()) {
                System.out.println("User first name valid");
                givenNameValid = true;
            }

            // Validate email
            if (passportDto.getEmail() != null && !passportDto.getEmail().isEmpty()) {
                System.out.println("User email valid");
                emailValid = true;
            }

            // Check if both fields are valid
            if (givenNameValid && emailValid) {
                 userAdded = passportDao.addPassport(passportDto);
                System.out.println("service info :" + passportDto);
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
