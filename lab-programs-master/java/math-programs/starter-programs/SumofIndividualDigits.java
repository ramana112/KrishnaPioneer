package com.math.programes;

import java.util.Scanner;

public class SumofIndividualDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		        int m, n, sum = 0;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter the number:");
		        m = s.nextInt();//stroing the number in m variable
		        while(m > 0)
		        {
		            n = m % 10;//performing modulo of the number
		            sum = sum + n;//calculating sum of individual digits
		            m = m / 10;//performing division
		        }
		        System.out.println("Sum of Digits:"+sum);//printing the sum of individual digits
		    }
		}
	