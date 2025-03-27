package com.backend.service;
import com.backend.model.*;
import java.util.List;
public interface ChatService {
    ChatMessage saveMessage(ChatMessage message);
    ChatMessage getMessageById(Long id);
    void deleteMessage(Long id);
    void deleteAllMessages();
    List<ChatMessage> getAllMessages();

    // trying to get the messages by sender
    List<ChatMessage> getMessagesBySender(String username);

    // trying to get the user by chat id
    User getuserByChatId(Long id);

    
}
