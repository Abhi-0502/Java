package com.xworkz.newspaper.dto;

public class NewspaperDto {

    private int id;
    private String paperName;
    private int noOfPages;
    private String language;
    private double price;
    private String editorName;
    private String date;
    private int noOfArticles;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setNoOfArticles(int noOfArticles) {
        this.noOfArticles = noOfArticles;
    }

    public int getNoOfArticles() {
        return noOfArticles;
    }

}


