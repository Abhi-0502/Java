package com.xworkz.camera;

import com.xworkz.camera.dao.cameraDao;
import com.xworkz.camera.dto.cameraDto;

public class cameraRunner {


    public static void main(String[] args) {
        cameraDao cameraDao = new cameraDao();
        cameraDto cameraDto = new cameraDto();

        cameraDto.currentVolume = 7;
        cameraDto.maxVolume = 12;


        cameraDao.addcamera(cameraDto);

        cameraDao.getcameraDetails();


    }
}


