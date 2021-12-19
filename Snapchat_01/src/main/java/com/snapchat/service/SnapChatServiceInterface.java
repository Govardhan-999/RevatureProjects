package com.snapchat.service;

import java.util.List;

import com.snapchat.entity.SnapChatUser;

public interface SnapChatServiceInterface {

	int createProfileService(SnapChatUser su);

	SnapChatUser[] viewAllProfileService();
	public List<SnapChatUser> viewAllProfileService1();

}
