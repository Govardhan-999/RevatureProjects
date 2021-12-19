package com.snapchat.utility;

import java.util.Comparator;

import com.snapchat.entity.SnapChatUser;

public class City_sorting implements Comparator<SnapChatUser>{

	public int compare(SnapChatUser o1, SnapChatUser o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}