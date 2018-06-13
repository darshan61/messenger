package com.sdarshan.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sdarshan.messenger.database.DatabaseClass;
import com.sdarshan.messenger.model.Message;

public class MessageService {
	private Map<Long, Message> messages = DatabaseClass.getAllMessages();

	public MessageService(){
		
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		if ((Long)id == null){
			System.out.println("id is null");
			return null;
		}
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId((long)messages.size() + 1 );
		message.setCreated(new Date());
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Long id,Message message){
		message.setId(id);
		if (messages.containsKey(message.getId())){
			messages.put(message.getId(), message);
			return message;
		}
		System.out.println("id does not exist");
		return null;
	}
	
	public void removeMessage(Long id){
		if ((Long)id == null){
			System.out.println("id cannot be null");
			return ;
		}
		messages.remove(id);
	}
	
}
