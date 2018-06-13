package com.sdarshan.messenger.model;

import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {
	private long id;
	private String message;
	private String author;
	private Date created;
	private Map<Long, Comment> comments;
	
	public Message(){
		
	}
	
	public Message(long id, String message,Date created, String author){
		this.id= id;
		this.author =author;
		this.message = message;
		this.created = created;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Map<Long, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}

}
