package com.sdarshan.messenger.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sdarshan.messenger.database.DatabaseClass;
import com.sdarshan.messenger.model.Comment;
import com.sdarshan.messenger.model.Message;

public class CommentService {
	
	private Map<Long, Message> messages = DatabaseClass.getAllMessages();

	public CommentService (){
		
	}
	
	public Map<Long,Comment> getComments(Long messageId){
			return messages.get(messageId).getComments();
	}
	
	public Comment getComment(Long messageId, Long commentId){
		Map<Long,Comment> comments = messages.get(messageId).getComments();
		return comments== null? null: comments.get(commentId);
	}
	
	public Comment addComment(Long messageId, Comment comment){
		Message msg = messages.get(messageId);
		Map<Long, Comment> comments = msg.getComments();
		
		comment.setId((comments==null || comments.isEmpty())? 1:comments.size() + 1);
		comment.setCreated(new Date());
		if (comments != null) {
		comments.put(comment.getId(), comment);
		}
		else {
		comments =new HashMap<Long,Comment>();
		comments.put(comment.getId(), comment);
		} 
		msg.setComments(comments);	
		return comment;
	}

	public void removeComment(Long messageId, Long commentId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		comments.remove(commentId);
	}
	
	public Comment updateComment(Long messageId, Long commentId, Comment comment){
		comment.setId(commentId);
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		comments.put(commentId, comment);
		return comment;
	}
}