package com.sdarshan.messenger.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sdarshan.messenger.model.Comment;
import com.sdarshan.messenger.service.CommentService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource{
	
	private CommentService commentService = new CommentService();
	
	
	public CommentResource() {
	
	}

	@GET
	public List<Comment> getComments(@PathParam("messageId") Long messageId){
		return new ArrayList<>(commentService.getComments(messageId).values());
	}
	
	@Path("/{commentId}")
	@GET
	public Comment getComment(@PathParam("messageId") Long messageId, @PathParam("commentId") Long commentId){
		return commentService.getComment(messageId, commentId);
	}
	
	@POST
	public Comment addComment(@PathParam("messageId") Long messageId, Comment comment){
		return commentService.addComment(messageId, comment);
	}
	
	@Path("/{commentId}")
	@DELETE
	public void removeComment(@PathParam("messageId") Long messageId, @PathParam("commentId") Long commentId){
		commentService.removeComment(messageId, commentId);
	}
	
	@Path("/{commentId}")
	@PUT
	public Comment updateComment(@PathParam("messageId") Long messageId, @PathParam("commentId") Long commentId, Comment comment){
		return commentService.updateComment(messageId, commentId, comment);
	}
}