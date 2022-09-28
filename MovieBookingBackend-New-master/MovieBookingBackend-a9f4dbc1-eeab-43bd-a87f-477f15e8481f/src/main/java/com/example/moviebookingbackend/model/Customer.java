package com.example.moviebookingbackend.model;


import lombok.*;

import javax.persistence.*;


@Table
@Data
@Entity


public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;
    private String email;
    private String userName;
    private String password;
    private String mobileNumber;
    private String location;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Customer(String email, String userName, String password, String mobileNumber, String location) {

        this.email = email;
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.location = location;
    }

    public Customer(int customerid) {
        this.customerid = customerid;
    }

    public  Customer()
    {}

}
