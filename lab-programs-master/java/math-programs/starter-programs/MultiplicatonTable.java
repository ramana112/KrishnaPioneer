package com.math.programes;

import java.util.Scanner;

public class MultiplicatonTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);//creating an object
			System.out.print("Enter number:");        
			int num=s.nextInt();//storing the number in num variable
		        for(int i=1; i <= 10; i++){//loop for iterating an list upto 10 numbers
		            System.out.println(num+" * "+i+" = "+num*i);//performing multiplication and print it out here
		        }

	}

}
