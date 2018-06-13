package com.sdarshan.messenger.resource;

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
import com.sdarshan.messenger.model.Message;
import com.sdarshan.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	private MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	@Path("/{messageId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id){
		return messageService.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return messageService.addMessage(message);
	}
	
	@Path("/{messageId}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") Long id, Message message){
		return messageService.updateMessage(id,message);
	}
	
	@Path("/{messageId}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void removeMessage(@PathParam("messageId") Long id){
		 messageService.removeMessage(id);
	}
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource(){
		return new CommentResource();
	}
	
}
