package com.haneesh.secretsanta.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Santa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String santa;

    public Santa(String santa, String child, String uniqueCode) {
        this.santa = santa;
        this.child = child;
        this.uniqueCode = uniqueCode;
    }

    public Santa() {
    }

    public String getSanta() {
        return santa;
    }

    public void setSanta(String santa) {
        this.santa = santa;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    private String child;
    private String uniqueCode;
}
