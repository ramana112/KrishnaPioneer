package com.math.programes;

import java.util.Scanner;

public class AverageThreeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//creating object 
		int num1, num2, num3, average;//declaration of variables
		System.out.println("Enter Num1");
		num1 = sc.nextInt();//taking value from keyboard and storing in num1
		System.out.println("Enter Num2");
		num2 = sc.nextInt();//taking value from keyboard and storing in num2
		System.out.println("Enter Num3");
		num3 = sc.nextInt();//taking value from keyboard and storing in num3
		average = ( num1 + num2 + num3 ) / 3;//fromula for calculating the average of given numbers
		System.out.println(" Average : "+average);//printing the average of given numbers
		}
	}
