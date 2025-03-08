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

@OneToMany
private List<ChatMessage> chatMessage;

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

public List<ChatMessage> getChatMessage() {
    return chatMessage;
}

public void setChatMessage(List<ChatMessage> chatMessage) {
    this.chatMessage = chatMessage;
}

public User(Long userId, String username, List<ChatMessage> chatMessage) {
    this.userId = userId;
    this.username = username;
    this.chatMessage = chatMessage;
}


}
