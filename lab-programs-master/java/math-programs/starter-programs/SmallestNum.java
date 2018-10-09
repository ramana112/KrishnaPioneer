package com.math.programes;

import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, small;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        num1 = scan.nextInt();//stroing the first entered number
        num2 = scan.nextInt();//storing the second entered number
		
        if(num1<num2)//checking whether the first number is less than second or not
        {
            small = num1;
        }
        else//print the below condition if above condition fails
        {
            small = num2;
        }
		
        System.out.print("smallest of Two Number is " +small);//printing the smallest of two numbers
}
}