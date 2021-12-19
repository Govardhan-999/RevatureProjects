package com.snapchat.dao;

import java.util.List;

import com.snapchat.entity.SnapChatUser;

public interface SnapChatDAOInterface {

	int createProfileDAO(SnapChatUser su);

	SnapChatUser[] viewAllProfileDAO();
	public List<SnapChatUser> viewAllProfileDAO1();

}
