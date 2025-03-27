package com.backend.serviceImpl;

import java.util.List;

import com.backend.model.ChatMessage;
import com.backend.model.User;
import com.backend.service.ChatService;

public class ChatServiceImpl implements ChatService{

    @Override
    public ChatMessage saveMessage(ChatMessage message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveMessage'");
    }

    @Override
    public ChatMessage getMessageById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessageById'");
    }

    @Override
    public void deleteMessage(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMessage'");
    }

    @Override
    public void deleteAllMessages() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllMessages'");
    }

    @Override
    public List<ChatMessage> getAllMessages() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMessages'");
    }

    @Override
    public List<ChatMessage> getMessagesBySender(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessagesBySender'");
    }

    @Override
    public User getuserByChatId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getuserByChatId'");
    }
     
}
