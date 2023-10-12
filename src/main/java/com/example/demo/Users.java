package com.example.demo;

public class Users {
    public String document;
    public String cellphone;
    public String code_residence;
    public String code_city;
    public String address;


    public Users(String document, String cellphone, String code_residence, String code_city, String address) {
        this.document = document;
        this.cellphone = cellphone;
        this.code_residence = code_residence;
        this.code_city = code_city;
        this.address = address;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCode_residence() {
        return code_residence;
    }

    public void setCode_residence(String code_residence) {
        this.code_residence = code_residence;
    }

    public String getCode_city() {
        return code_city;
    }

    public void setCode_city(String code_city) {
        this.code_city = code_city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
