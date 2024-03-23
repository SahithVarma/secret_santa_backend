package com.haneesh.secretsanta.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Task {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private Date timestamp;
    private String uniqueCode;
    private String user;
    private String task;

    public Task() {
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public Task(String uniqueCode, String user, String task) {
        this.uniqueCode = uniqueCode;
        this.user = user;
        this.task = task;
        this.timestamp = new Date();

    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    // For setting timestamp before persisting
    // Note: MongoDB does not support @PrePersist annotation
    public void onCreate() {
        timestamp = new Date();
    }
}
