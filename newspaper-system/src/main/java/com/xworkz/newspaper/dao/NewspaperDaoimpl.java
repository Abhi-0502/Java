package com.xworkz.newspaper.dao;

import com.xworkz.newspaper.dto.NewspaperDto;

public class NewspaperDaoimpl implements NewspaperInterfaceDao{

    @Override
    public void addNewspaper(NewspaperDto newspaperDto) {
        
    }

    @Override
    public NewspaperDto[] getAllNewsPaper() {
        return new NewspaperDto[0];
    }

    @Override
    public NewspaperDto getNewsPaperByDate(String date) {
        return null;
    }

    @Override
    public NewspaperDto getNewsPaperByLang(String lang) {
        return null;
    }

    @Override
    public NewspaperDto getNewsPaperById(int id) {
        return null;
    }

    @Override
    public NewspaperDto getPaperNofPagesByLanguage() {
        return null;
    }

    @Override
    public NewspaperDto getNoOfArticlesById() {
        return null;
    }

    @Override
    public NewspaperDto getDateById() {
        return null;
    }

    @Override
    public NewspaperDto UpdateNoOfArticlesByDate() {
        return null;
    }

    @Override
    public NewspaperDto deleteNewsPaperById() {
        return null;
    }

    @Override
    public String getPaperNameByLang(String lang) {
        return "";
    }

    @Override
    public NewspaperDto getPaperNameById() {
        return null;
    }
}
