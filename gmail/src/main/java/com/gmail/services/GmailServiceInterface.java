package com.gmail.services;

import java.util.List;

import com.gmail.entity.GmailUserEntity;

public interface GmailServiceInterface {

	int createProfileService(GmailUserEntity gu);

	List<GmailUserEntity> viewAllprofileService();
	

}
