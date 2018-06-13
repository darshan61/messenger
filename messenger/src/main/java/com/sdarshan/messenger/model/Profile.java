package com.sdarshan.messenger.model;
import java.util.Date;
//import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
	private long id;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;
//	private List<Message> messages;
	
	public Profile(){
		
	}
	
	public Profile(long id, String profileName, String firstName, String lastName, Date created){
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = created;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

//	public List<Message> getMessages() {
//		return messages;
//	}

//	public void setMessages(List<Message> messages) {
//		this.messages = messages;
//	}
	
}