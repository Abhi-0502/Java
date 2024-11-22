package com.xworkz.passportapp.passportuser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class PassportUser {

    private int id;
    private String Name;
    private long Phno;
    private double price;
    private String gender;
    private int age;
    private String address;

}
 /*   @Override
    public String toString() {
        return "PassportUser{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Phno=" + Phno +
                ", price=" + price +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(long phno) {
        Phno = phno;
    }

    public long getPhno() {
        return Phno;
    }*/



