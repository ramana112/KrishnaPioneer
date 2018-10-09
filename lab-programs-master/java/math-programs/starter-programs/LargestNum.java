package com.math.programes;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1, num2, big;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Two Number : ");
	        num1 = scan.nextInt();//stroing the first entered number
	        num2 = scan.nextInt();//storing the second entered number
			
	        if(num1>num2)//checking whether the first number is greater than second or not
	        {
	            big = num1;
	        }
	        else//print the below condition if above condition fails
	        {
	            big = num2;
	        }
			
	        System.out.print("Largest of Two Number is " +big);//printing the largest of two numbers
	}

}
