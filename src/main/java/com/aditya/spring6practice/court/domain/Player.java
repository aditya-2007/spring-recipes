package com.aditya.spring6practice.court.domain;

public class Player {
    
    private String name;
    private String phone;
    
    public Player() {
	
    }
    
    public Player(String name) {
	this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
