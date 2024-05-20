package com.demo.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class SchoolInfomation {
    private String fullname="FPT polytechnic";
    private String location="Quan 12";

    public SchoolInfomation() {
    }

    public SchoolInfomation(String fullname, String location) {
        this.fullname = fullname;
        this.location = location;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
