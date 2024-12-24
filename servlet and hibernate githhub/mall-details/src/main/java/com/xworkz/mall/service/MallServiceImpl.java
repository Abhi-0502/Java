package com.xworkz.mall.service;

import com.xworkz.mall.dao.MallDao;
import com.xworkz.mall.dto.MallDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MallServiceImpl implements MallService{

    @Autowired
    private MallDao mallDao;

    boolean isvalidated = false;

    @Override
    public boolean validatedAndSave(MallDto mallDto) {
        if(mallDto !=null){
            if(mallDto.getMallName() != null && !mallDto.getMallName().isEmpty()){
                System.out.println("Name validated");
                mallDao.save(mallDto);
                isvalidated = true;
            }
        }
        return isvalidated;
    }

    @Override
    public MallDto getUserById(int id) {
        return mallDao.getUserById(id);
    }

    @Override
    public List<MallDto> getAllDetails(MallDto mallDto) {
        return mallDao.getAllDetails(mallDto);
    }

    @Override
    public void updateUserById(int id, MallDto newUserData) {
        mallDao.updateUserById(id,newUserData);
    }

    @Override
    public boolean DeleteUserById(int id) {
        return mallDao.DeleteUserById(id);
    }
}
