package com.snapchat.service;

import java.util.List;

import com.snapchat.dao.SnapChatDAO;
import com.snapchat.dao.SnapChatDAOInterface;
import com.snapchat.entity.SnapChatUser;

public class SnapChatService implements SnapChatServiceInterface {

	public int createProfileService(SnapChatUser su) {
		// TODO Auto-generated method stub
		SnapChatDAOInterface sd=new SnapChatDAO();
		return sd.createProfileDAO(su);
	}

	//via array
	public SnapChatUser[] viewAllProfileService() {
		SnapChatDAOInterface sd=new SnapChatDAO();
		return sd.viewAllProfileDAO();
	}
	
	//via collection
	
	public List<SnapChatUser> viewAllProfileService1() {
		SnapChatDAOInterface sd=new SnapChatDAO();
		return sd.viewAllProfileDAO1();
	}
}
