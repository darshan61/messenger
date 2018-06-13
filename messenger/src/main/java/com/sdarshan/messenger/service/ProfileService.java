package com.sdarshan.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sdarshan.messenger.database.DatabaseClass;
import com.sdarshan.messenger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles= DatabaseClass.getAllProfiles();

	public List<Profile> getProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size() +1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(String profileName, Profile profile){
		Profile prof = profiles.get(profileName);
		profile.setId(prof.getId());
		profiles.put(profileName, profile);
		return prof;
	}
	
	public void removeProfile(String profileName){
		profiles.remove(profileName);
	}
}