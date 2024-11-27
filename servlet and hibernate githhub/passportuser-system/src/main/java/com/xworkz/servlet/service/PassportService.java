package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.PassportDto;

public interface PassportService {

    boolean validateAndSavePassport(PassportDto passportDto);
}
