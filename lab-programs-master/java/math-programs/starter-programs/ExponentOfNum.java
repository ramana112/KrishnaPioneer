package com.math.programes;

import java.util.Scanner;

public class ExponentOfNum {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
		  System.out.println("Enter the  num : ");
			Scanner sc = new Scanner(System.in);//creating an object
			int num = sc.nextInt();//storing the number in the num variable
		     System.out.println("Exponent value of num is: "+Math.getExponent(num));//geting the exponent value and printing the value
	}

}
