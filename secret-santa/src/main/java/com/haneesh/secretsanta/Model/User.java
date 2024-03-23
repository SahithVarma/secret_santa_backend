package com.haneesh.secretsanta.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private long phoneNumber;
    private String address;
    private String uniqueCode;
    private String wishlist;
    private String gmail;
    private String hints;
    private String tasks;
    private boolean giftStatus;

    public User() {
    }

    public User(String name, long phoneNumber, String address, String wishlist, String gmail, boolean giftStatus, String uniqueCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.wishlist = wishlist;
        this.gmail = gmail;
        this.giftStatus = giftStatus;
        this.uniqueCode = uniqueCode;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

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

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
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

    public boolean isGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(boolean giftStatus) {
        this.giftStatus = giftStatus;
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
}
