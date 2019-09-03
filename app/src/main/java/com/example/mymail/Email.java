package com.example.mymail;

import java.util.Date;
import java.util.TimeZone;

public class Email {
    private  String name;
    private String title;
    private String desk;
    private String time;
    private  String color;

    private String nameUpperCase;

    public String getNameUpperCase() {

        char uppercase = name.charAt(0);
        this.nameUpperCase = String.valueOf(uppercase);

        return nameUpperCase;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }





}
