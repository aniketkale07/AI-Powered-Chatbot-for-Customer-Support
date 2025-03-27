package com.backend.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(unique = true)
    private String username;
    private String password;
    private String role;
    private boolean isLogged;
    private boolean isLoggedOut;

    // this are for future changes if needed
    private boolean temp1;
    private boolean temp2;
    private boolean temp3;
    private String stringTemp1;
    private String stringTemp2;
    private String stringTemp3;

    @OneToMany
    private List<ChatMessage> chatMessage;


    public User() {
        // TODO Auto-generated constructor stub
    }


    public Long getUserId() {
        return userId;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
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


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public boolean isLogged() {
        return isLogged;
    }


    public void setLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }


    public boolean isLoggedOut() {
        return isLoggedOut;
    }


    public void setLoggedOut(boolean isLoggedOut) {
        this.isLoggedOut = isLoggedOut;
    }


    public boolean isTemp1() {
        return temp1;
    }


    public void setTemp1(boolean temp1) {
        this.temp1 = temp1;
    }


    public boolean isTemp2() {
        return temp2;
    }


    public void setTemp2(boolean temp2) {
        this.temp2 = temp2;
    }


    public boolean isTemp3() {
        return temp3;
    }


    public void setTemp3(boolean temp3) {
        this.temp3 = temp3;
    }


    public String getStringTemp1() {
        return stringTemp1;
    }


    public void setStringTemp1(String stringTemp1) {
        this.stringTemp1 = stringTemp1;
    }


    public String getStringTemp2() {
        return stringTemp2;
    }


    public void setStringTemp2(String stringTemp2) {
        this.stringTemp2 = stringTemp2;
    }


    public String getStringTemp3() {
        return stringTemp3;
    }


    public void setStringTemp3(String stringTemp3) {
        this.stringTemp3 = stringTemp3;
    }


    public List<ChatMessage> getChatMessage() {
        return chatMessage;
    }


    public void setChatMessage(List<ChatMessage> chatMessage) {
        this.chatMessage = chatMessage;
    }


    public User(Long userId, String username, String password, String role, boolean isLogged, boolean isLoggedOut,
            boolean temp1, boolean temp2, boolean temp3, String stringTemp1, String stringTemp2, String stringTemp3,
            List<ChatMessage> chatMessage) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.isLogged = isLogged;
        this.isLoggedOut = isLoggedOut;
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.temp3 = temp3;
        this.stringTemp1 = stringTemp1;
        this.stringTemp2 = stringTemp2;
        this.stringTemp3 = stringTemp3;
        this.chatMessage = chatMessage;
    }

    
}