package com.snapchat;

import java.util.Scanner;

import com.snapchat.controller.SnapChatController;
import com.snapchat.controller.SnapChatControllerInterface;

public class SnapChatView {

	public static void main(String[] args) {
		String ss="y";
		
		while(ss.equals("y")) {
		
		System.out.println("***********Main Menu***********");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view all profile");
		
		System.out.println("enter your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		SnapChatControllerInterface sc1=new SnapChatController();
		
		switch(ch) {
		case 1: int i=sc1.createProfileController();
				if(i>0) {
					System.out.println("profile created successfully");
				}
				else {
					System.out.println("could not create profile");
				}
			break;
		case 2: int j=sc1.viewAllProfileController1();
				if(j>0) {
					System.out.println(j+"  record found");
				}
				else {
					System.out.println("no record found");
				}
			break;
			default:System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		}

	}

}
