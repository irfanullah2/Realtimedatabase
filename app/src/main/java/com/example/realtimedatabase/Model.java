package com.example.realtimedatabase;

public class Model {
    String name, email, phoneNo, Address;

    public Model(String name, String email, String phoneNo, String address) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

