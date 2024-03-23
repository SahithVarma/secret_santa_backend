package com.haneesh.secretsanta.Model;


import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timestamp", nullable = false, updatable = false)
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

        this.uniqueCode=uniqueCode;
        this.user = user;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    @PrePersist
    protected void onCreate() {
        timestamp = new Date();
    }

}
