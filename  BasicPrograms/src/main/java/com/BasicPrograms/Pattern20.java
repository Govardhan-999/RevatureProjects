package com.BasicPrograms;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

	}

}
