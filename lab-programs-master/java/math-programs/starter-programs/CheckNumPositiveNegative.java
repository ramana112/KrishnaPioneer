package com.math.programes;

import java.util.Scanner;

public class CheckNumPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int num;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number to check:");
	        num = s.nextInt();//storing the number in num variable that is taken from keyboard
	        if(num > 0){//condition for checking that the number is positive
	            System.out.println("The given number "+num+" is Positive");
	        }
	        else if(num < 0)//condition for checking that the number is negative
	        {
	            System.out.println("The given number "+num+" is Negative");
	        }
	        else//to print other than above two conditions fail
	        {
	            System.out.println("The given number "+num+" is neither Positive nor Negative ");
	        }
		

	}

}
