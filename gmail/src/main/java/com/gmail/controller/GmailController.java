package com.gmail.controller;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.gmail.entity.GmailUserEntity;
import com.gmail.services.GmailService;
import com.gmail.services.GmailServiceInterface;
import com.gmail.utility.NewNameSorting;

public class GmailController implements GmailControllerInterface {

	public int CreateProfileController() {
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your Name");
		 String name=sc.next();
		 System.out.println("Enter your Password");
		 String password=sc.next();
		 System.out.println("Enter your Mobile number");
		 long mobilenumber=sc.nextLong();
		 System.out.println("Enter your address");
		 String address=sc.next();
		 
		 GmailUserEntity gu=new GmailUserEntity();
		 gu.setName(name);
		 gu.setPassword(password);
		 gu.setMobilenumber(mobilenumber);
		 gu.setAddress(address);
		 
		 GmailServiceInterface gs=new GmailService();
		 int i=gs.createProfileService(gu);
		 
		 return i;}
		 
	 

	public int ViewAllProfileController() {
		int aa=0;
		 GmailServiceInterface gs=new GmailService();
		 List<GmailUserEntity> g=gs.viewAllprofileService();
		 for(GmailUserEntity g3:g)
		 
		 {
			 if(g3!=null)
			 {
				 System.out.println("name "+g3.getName()); 
				 System.out.println("your password "+g3.getPassword());
				 System.out.println("your  mobile number "+g3.getMobilenumber());
				 System.out.println("your address "+g3.getAddress());
				 aa++;
				 
			 }
			 else{
				 break;
				 
			 }
		 }
			 Collections.sort(g,new NewNameSorting());
			 System.out.println("========================");
			 System.out.println("=========== after sorting =============");
			 for(GmailUserEntity g4:g)
				 
			 {
				 if(g4!=null)
				 {
					 System.out.println("name "+g4.getName()); 
					 System.out.println("your password "+g4.getPassword());
					 System.out.println("your  mobile number "+g4.getMobilenumber());
					 System.out.println("your address "+g4.getAddress());
					  
					 
				 }
				 else{
					 break;
			 
				 
		 }
		 
		
	
			 
	 
		 }
			 return aa;
	
	}
}
