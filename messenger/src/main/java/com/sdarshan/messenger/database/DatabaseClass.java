package com.sdarshan.messenger.database;
import java.util.HashMap;
import java.util.Map;


import com.sdarshan.messenger.model.Message;
import com.sdarshan.messenger.model.Profile;
public class DatabaseClass {
	
	public static Map<Long, Message> messages = new HashMap<Long, Message>();;
	public static Map<String, Profile> profiles = new HashMap<String, Profile>();
	
	public static Map<Long, Message> getAllMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getAllProfiles(){
		return profiles;
	}
	
}
