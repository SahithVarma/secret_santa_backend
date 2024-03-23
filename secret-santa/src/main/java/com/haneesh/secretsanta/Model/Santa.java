package com.haneesh.secretsanta.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Santa {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id; // MongoDB uses ObjectId as the default type for _id

    private String santa;
    private String child;
    private String uniqueCode;

    public Santa(String santa, String child, String uniqueCode) {
        this.santa = santa;
        this.child = child;
        this.uniqueCode = uniqueCode;
    }

    public Santa() {
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

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
}
