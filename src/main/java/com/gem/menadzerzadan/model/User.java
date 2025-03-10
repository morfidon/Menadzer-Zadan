package com.gem.menadzerzadan.model;

import jakarta.persistence.*;

//JPA, HIBERNATE
@Entity
@Table(name = "users")
public class User //user
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //IDentyfikator - UNIKALNIE

    private String username;
    private String password;
    private String email;

    public User() {
    }

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // SQL - CREATE TABLE nazwa_tabeli
    // HIBERNATE
    // MVC - Model View Controller -
}
