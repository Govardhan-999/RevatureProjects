package com.snapchat.dao;
import java.util.ArrayList;
import java.util.List;

import com.snapchat.entity.SnapChatUser;

public class SnapChatDAO implements SnapChatDAOInterface {

	private static SnapChatUser uu[]=new SnapChatUser[10];
	
	private static List<SnapChatUser> uu1=new ArrayList<SnapChatUser>();
	
	//drawback is array have fixed size so how to create dynamic array means if we will add object size of array should grow and if will delete size should shrink
	
	public int createProfileDAO(SnapChatUser su) {
		//array method start
		/*int i=0;
		for(int j=0;j<uu.length;j++) {
			if(uu[j]==null) {
				uu[j]=su;
				i=1;
				break;
			}
		}
		return i;*/
		//array method end
		//collection method start  .
		int i=0;
		uu1.add(su);
		if(uu1.size()>0) {
			i=1;
		}
		return i;
	}

	//via array concept
	public SnapChatUser[] viewAllProfileDAO() {
		// TODO Auto-generated method stub
		return uu;
	}
	
	//via collection
	public List<SnapChatUser> viewAllProfileDAO1() {
		// TODO Auto-generated method stub
		return uu1;
	}
	
	

}







