package com.BasicPrograms;

public class SwapTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 100;  
	        int y =200;  
	        System.out.println("before swapping numbers: "+x +" "+ y);  
	       /*Swapping*/  
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("After swapping: "+x +"  " + y);  

	}

}
