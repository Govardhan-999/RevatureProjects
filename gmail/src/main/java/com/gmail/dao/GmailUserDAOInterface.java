package com.gmail.dao;

import java.util.List;

import com.gmail.entity.GmailUserEntity;

public interface GmailUserDAOInterface {

	int createprofileService(GmailUserEntity gu);

	List<GmailUserEntity> viewAllprofile();

}
