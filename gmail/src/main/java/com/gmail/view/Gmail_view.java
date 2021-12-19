package com.gmail.view;

import java.util.Scanner;

import com.gmail.controller.GmailController;
import com.gmail.controller.GmailControllerInterface;

public class Gmail_view {

	public static void main(String[] args) {
		 String ss="y";
		 while(ss.equals("y"))
		 {
			 System.out.println("=== welcome ===");
			 System.out.println("-------------------");
			 System.out.println("press 1 to create profile ");
			 System.out.println("press 2 to view All Profiles");
			 System.out.println("enter your choice");
			 
			 Scanner sc=new Scanner(System.in);
			 int ch=sc.nextInt();
			 GmailControllerInterface gc= new GmailController();
			 
			 switch(ch){
			 case 1:int i=gc.CreateProfileController();
			 			if(i>0)
			 				System.out.println("Profile Created Succesfully");
			 			else
			 				 System.out.println("could not create your profile");
				 break;
			 case 2:int j=gc.ViewAllProfileController();
			 			if(j>0)
			 				 System.out.println(j+" records found ");
			 			else
			 				 System.out.println(" no records found ");
				 break;
				 default:System.out.println("wrong choice");
			 }
			 System.out.println("do you want to continue press y/n");
				ss=sc.next();
			 
		 }
	}

}
