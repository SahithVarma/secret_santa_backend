package com.haneesh.secretsanta.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import java.util.Calendar;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Team {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String uniqueCode;
    private int numOfPlayers;
    private Date endDate;
    private int maxBudget;
    private int minBudget;

    public Team() {
    }

    public Team(String uniqueCode, int numOfPlayers, Date endDate, int maxBudget, int minBudget) {
        this.uniqueCode = uniqueCode;
        this.numOfPlayers = numOfPlayers;
        setEndDate(endDate);
        this.maxBudget = maxBudget;
        this.minBudget = minBudget;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = normalizeToDateOnly(endDate);
    }

    public int getMaxBudget() {
        return maxBudget;
    }

    public void setMaxBudget(int maxBudget) {
        this.maxBudget = maxBudget;
    }

    public int getMinBudget() {
        return minBudget;
    }

    public void setMinBudget(int minBudget) {
        this.minBudget = minBudget;
    }
    private Date normalizeToDateOnly(Date date) {
        if (date == null) return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
