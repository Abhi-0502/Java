package com.xworkz.passportapp.passport.impl;

import com.xworkz.passportapp.PassportIdNotFound;
import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.passportuser.PassportUser;

public class PassportuserImpl  implements Passport {


   PassportUser passportUsers[] = new PassportUser[1];
    int index;

    private PassportUser passport;
    boolean isAdded = false;

    @Override
    public boolean addPassport(PassportUser passportUser) {
        try {


            if (passportUser != null) {
                if (passportUser.getName() != null) {
                    this.passportUsers[index++] = passportUser;
                    isAdded = true;
                }
            } else {
                PassportIdNotFound passportIdNotFound = new PassportIdNotFound("Given id is not found");
                throw passportIdNotFound;
            }
        } catch (PassportIdNotFound e) {
            e.printStackTrace();
        }

        return isAdded;
    }

    @Override
    public void getPassport() {
        for ( PassportUser passportUsers : passportUsers)
            System.out.println("User details : " + passportUsers);
        }

 /*   @Override
    public boolean updateUser(String newPassportUserName, String existingPassportUserName) {
        boolean isUpdated = false;
        boolean newhintAns;
        if(newhintAns != null){
            this.passportUsers.setHintAns(newhintAns);
            isUpdated = true;
        }else System.out.println("Invalid answer");
        return isUpdated;
    }*/



    /*   @Override
    public boolean updateUser(String newPassportUserName,String existingPassportUserName) {
            if (passport.getPassportUserName() == existingPassportUserName){
                passport.setPassportUserName(newPassportUserName);
     }
        return false;
    }*/

    @Override
    public boolean deletePassport() {
        boolean isDeleted = false;
            if(this.passportUsers[index++] == null){
                this.passportUsers = passportUsers;
                isDeleted = true;
            }
            else System.out.println("Cannot be deleted");

            return isDeleted;
        }

    //update phone number by id;
    @Override
    public boolean updatePhoneNoById(long phoneNewNo, int existingid) {
        boolean isUpdated = false;
        for (int index = 0; index < passportUsers.length; index++) {
            if (passportUsers[index].getId() == existingid) {
                this.passportUsers[index].setPhno(phoneNewNo);
                isUpdated = true;
            } else
                System.out.println("Id cannot find");
        }


        return isUpdated;
    }

    @Override
    public boolean updateAddressById(String newAddress, int existingid) {
        boolean isUpdated = true;
        for (int index = 0; index < 1; index++) {
            if(passportUsers[index].getId() == existingid){
                this.passportUsers[index].setAddress(newAddress);
                isUpdated = true;
            }else
                System.out.println("Id cannot found");
        }
        return isUpdated;
    }

    @Override
    public String getGenderByName(String name) {
        String gender = null;
        for (int index = 0; index < passportUsers.length; index++) {
            if (this.passportUsers[index].getName().equals(name)) {
                gender = this.passportUsers[index++].getGender();
            }else
                System.out.println("Name cannot found");
        }
        return gender;
    }

    @Override
    public int getAgeByName(String name) {
        int age = 0;
        for (int index = 0; index < passportUsers.length; index++) {
            if(this.passportUsers[index].getName().equals(name)) {
                age = this.passportUsers[index].getAge();
            }else
                System.out.println("Name cannot found");
        }
        return age;
    }

    @Override
    public String getNameById(int id) {
        String name = null;
        for (int index = 0; index < passportUsers.length; index++) {
            if(this.passportUsers[index].getId() == id) {
                name = this.passportUsers[index].getName();
            }else
                System.out.println("Cannot found Id");
        }
        return name;
    }

}
