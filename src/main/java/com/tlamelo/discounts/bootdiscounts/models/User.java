package com.tlamelo.discounts.bootdiscounts.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@Table(name="USERS")
public class User {
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name="Name")
    private String name;
    @Column(name="Type")
    private String type;
    @Column(name="Is_active")
    private int is_active;
    @Column(name="Registration_date")
    private Date registration;

    public  User(){

    }
    public User(int id, String name, String type, int is_active, Date registration) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.is_active = is_active;
        this.registration = registration;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
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
}
