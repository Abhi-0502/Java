package com.xworkz.camera.dao;

import com.xworkz.camera.dto.cameraDto;

public class cameraDao {

    cameraDto dto;

    public cameraDao() {
        System.out.println("camera given is information invoke successfully");
    }

    public boolean addcamera(cameraDto dto) {
        boolean iscameraAdded = false;
        boolean iscurrentVolume = false;
        boolean ismaxVolume = false;


        if (dto != null) {
            if (dto.currentVolume > 0) {
                this.dto = dto;
                iscurrentVolume = true;
            } else
                System.out.println("please enter your valid currentVolume");
            if (dto.maxVolume > 0) {
                this.dto = dto;
                ismaxVolume = true;
            } else
                System.out.println("plase enter your valid maxVolume ");

        } else {
            System.out.println("please provide valid information");
            if (iscurrentVolume == true && ismaxVolume == true) {
                this.dto = dto;
                iscameraAdded = true;
            }
        }
        return iscameraAdded;
    }

    public void getcameraDetails() {
        System.out.println("camera currentVolume is" + dto.currentVolume);
        System.out.println("camera maxvolume is" + dto.maxVolume);

    }
}