package com.haneesh.secretsanta.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long phoneNumber;
    private String address;
    private String uniqueCode;
    private String wishlist;
    private String gmail;
    private String hints;
    private String tasks;
    public User() {
    }

    public User(String name, long phoneNumber, String address, String wishlist, String gmail, boolean gift_status,String uniqueCode) {
//        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.wishlist = wishlist;
        this.gmail = gmail;
        this.gift_status = gift_status;
        this.uniqueCode=uniqueCode;

    }

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public boolean isGift_status() {
        return gift_status;
    }

    public void setGift_status(boolean gift_status) {
        this.gift_status = gift_status;
    }

    private boolean gift_status;

}
