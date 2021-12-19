package com.gmail.services;

import java.util.List;

import com.gmail.dao.GmailUserDAO;
import com.gmail.dao.GmailUserDAOInterface;
import com.gmail.entity.GmailUserEntity;

public class GmailService implements GmailServiceInterface {

	public int createProfileService(GmailUserEntity gu) {
		
		GmailUserDAOInterface gd=new GmailUserDAO();
		
		 
		return gd.createprofileService(gu);
	}

	public List<GmailUserEntity> viewAllprofileService() {
		GmailUserDAOInterface gd=new GmailUserDAO();
		 
		return gd.viewAllprofile();
	}

	 

}
