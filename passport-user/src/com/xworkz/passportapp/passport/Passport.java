package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.passport.impl.PassportuserImpl;
import com.xworkz.passportapp.passportuser.PassportUser;

public interface Passport {

    boolean addPassport(PassportUser passportUser);
    void getPassport();
   // boolean updateUser(String newPassportUserName,String existingPassportUserName );
    boolean deletePassport();

    boolean updatePhoneNoById(long phoneNewNo, int existingid);
    boolean updateAddressById(String newAddress, int existingid);
    String getGenderByName(String name);
    int getAgeByName(String name);
    String getNameById(int id);


}
