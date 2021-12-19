package com.BasicPrograms;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=2020,t=5, n=12;
		double r=0.8;
		double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
        /*Here P is principal amount.	
		R is the annual interest rate.
		t is the time the money is invested or borrowed for.
		n is the number of times that interest is compounded per unit t*/

	}

}
