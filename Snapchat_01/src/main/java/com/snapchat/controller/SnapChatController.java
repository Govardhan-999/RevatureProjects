package com.snapchat.controller;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.snapchat.entity.SnapChatUser;
import com.snapchat.service.SnapChatService;
import com.snapchat.service.SnapChatServiceInterface;
import com.snapchat.utility.City_sorting;

//responsibility of controller layer is to take request and pass to service and take response from service and pass to view
public class SnapChatController implements SnapChatControllerInterface {

	public int createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter  name");
		String name=sc.next();
		
		System.out.println("enter  password");
		String password=sc.next();
		
		System.out.println("enter  email");
		String email=sc.next();
		
		System.out.println("enter  address");
		String address=sc.next();
		
		//now above it will pass to service inform of object because of DTO design pattern. object of what? object of entity class
		
		SnapChatUser su=new SnapChatUser();
		su.setName(name);
		su.setPassword(password);
		su.setEmail(email);
		su.setAddress(address);
		
		//now above object controller will pass to service
		SnapChatServiceInterface ss=new SnapChatService();
		int i=ss.createProfileService(su);
		
		return i;
	}

	public int viewAllProfileController() {
		int aa=0;
		SnapChatServiceInterface ss=new SnapChatService();
		SnapChatUser a[]=ss.viewAllProfileService();
		
		for(int j=0;j<a.length;j++) {
			
		}
		
		for(SnapChatUser s3:a) {
			if(s3!=null) {
				System.out.println("********************");
				System.out.println("name is "+s3.getName());
				System.out.println("Password is "+s3.getPassword());
				System.out.println("Email is "+s3.getEmail());
				System.out.println("Address is "+s3.getAddress());
				aa++;
			}
			else {
				break;
			}
		}
		
		return aa;
	}
	
	public int viewAllProfileController1() {
		int aa=0;
		SnapChatServiceInterface ss=new SnapChatService();
		List<SnapChatUser> a=ss.viewAllProfileService1();
		
		
		for(SnapChatUser s3:a) {
			if(s3!=null) {
				System.out.println("********************");
				System.out.println("name is "+s3.getName());
				System.out.println("Password is "+s3.getPassword());
				System.out.println("Email is "+s3.getEmail());
				System.out.println("Address is "+s3.getAddress());
				aa++;
			}
			else {
				break;
			}
		}
Collections.sort(a, new City_sorting());
		
		System.out.println("after shorting");
		
		for(SnapChatUser s3:a) {
			if(s3!=null) {
				System.out.println("********");
				System.out.println("name is "+s3.getName());
				System.out.println("Password is "+s3.getPassword());
				System.out.println("Email is "+s3.getEmail());
				System.out.println("Address is "+s3.getAddress());
				
			}
			else {
				break;
			}
		}
		
		return aa;
	}

}





