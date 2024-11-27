package com.xworkz.servlet.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "passportdetails")
public class PassportDto {

    @Id
  @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column
    private int id;
    @Column(name = "cprLocation")
    private String cprLocation;
    @Column(name = "dcdrLocation")
    private int dcdrLocation;
    @Column(name = "givenName")
    private String givenName;
    @Column(name="dob")
    private String dob;
    @Column(name = "email")
    private String email;
    @Column(name = "surName")
    private String surName;
    @Column(name = "isEmailLoginSame")
    private boolean isEmailLoginSame;
    @Column(name = "loginId")
    private int loginId;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "hideAns")
    private String hideAns;
    @Column(name = "confirmPwd")
    private String confirmPwd;
    @Column(name = "captcha")
    private String captcha;

}

