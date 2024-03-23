package com.haneesh.secretsanta.Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Team {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    private String uniqueCode;
    private int numOfPlayers;
    private Date endDate;

    private int maxBudget;

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

    private int minBudget;

    public Team() {
    }

    public Team(int id, String uniqueCode, int numOfPlayers, Date endDate,int maxBudget,int minBudget) {
        this.id = id;
        this.uniqueCode = uniqueCode;
        this.numOfPlayers = numOfPlayers;
        this.endDate = endDate;
        this.maxBudget=maxBudget;
        this.minBudget=minBudget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        this.endDate = endDate;
    }
}
