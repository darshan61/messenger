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
import com.sdarshan.messenger.model.Profile;
import com.sdarshan.messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	private ProfileService profileService = new ProfileService();
	
	@GET
	public List<Profile> getProfiles(){
		return profileService.getProfiles();
	}

	@Path("/{profileName}")
	@GET
	public Profile getProfile(@PathParam("profileName") String profileName){
		return profileService.getProfile(profileName);
	}
	
	@POST
	public Profile addProfile(Profile profile){
		return profileService.addProfile(profile);		
	}
	
	@Path("/{profileName}")
	@PUT
	public Profile updateProfile(@PathParam("profileName") String profileName,Profile profile){
		return profileService.updateProfile(profileName,profile);
	}
	
	@Path("/{profileName}")
	@DELETE
	public void removeProfile(@PathParam("profileName") String profileName){
		profileService.removeProfile(profileName);
	}
}