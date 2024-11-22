package com.xworkz.passportapp;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.passport.impl.PassportuserImpl;
import com.xworkz.passportapp.passportuser.PassportUser;

import java.util.Scanner;


public class PassportRunner {

    public static void main(String[] args){

        Passport passport = new PassportuserImpl();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 2; index++) {
            PassportUser passportUser = new PassportUser();

            System.out.println("Enter a Id");
            int id = scanner.nextInt();
            passportUser.setId(id);

            System.out.println("Enter a name");
            String name = scanner.next();
           passportUser.setName(name);

            System.out.println("Enter a gender");
            String gender = scanner.next();
           passportUser.setGender(gender);

            System.out.println("Enter a age");
            int age = scanner.nextInt();
          passportUser.setAge(age);

            System.out.println("Enter a address");
            String address = scanner.next();
            passportUser.setAddress(address);

            System.out.println("Enter phone number");
            long phno = scanner.nextLong();
            passportUser.setPhno(phno);
            passport.getPassport();
        }
        passport.getPassport();

        //updatePhoneNoById;
        PassportUser passportUser = new PassportUser();
        System.out.println("Enter a Id Which you want to change number");
        int id = scanner.nextInt();

        System.out.println("Enter a new phone number");
        long newNo = scanner.nextLong();
        passportUser.setPhno(newNo);

        passport.updatePhoneNoById(newNo,id);
        passport.getPassport();

        //update updateAddressById;
        System.out.println("Enter a id you want to change address");
        id = scanner.nextInt();

        System.out.println("Enter a new address");
        String address = scanner.next();
        passportUser.setAddress(address);

        passport.updateAddressById(address,id);
        passport.getPassport();

        //getGenderByName
        System.out.println("Enter a name to get gender");
        String name = scanner.next();

        String gender = passport.getGenderByName(name);
        System.out.println("The gender is : "+ gender);

        //passport.getAllUserDetails();

        //get age by name;
        System.out.println("Enter a name which you want to get the age");
        name = scanner.next();

        int age = passport.getAgeByName(name);
        System.out.println("The age of the given name is: "+ age);

        //get Name By Id;
        System.out.println("Enter a Id to get a name");
        id = scanner.nextInt();
        name = passport.getNameById(id);
        System.out.println("The Name of the given Id is: "+name);
    }
    }

      /*  PassportUser passport = new PassportUser();
        passport.setId(1);
        passport.setName("abhi");
        passport.setPhno(12365478l);
        passport.setPrice(3000);

     Passport   PassportuserImpl = new PassportuserImpl();
        PassportuserImpl.addPassport(passport);
        System.out.println("Before passportuser details");
        PassportuserImpl.getPassport();

     //   PassportuserImpl.updateUser(2,1,"Mahi","abhi","12345","78965" ,passport.getId() ,passport.getPassportUserName(),passport.getPhno());
        PassportuserImpl.updateUser("ma","abhi");
        System.out.println("After passportuser details");
        PassportuserImpl.getPassport();
    }*/

