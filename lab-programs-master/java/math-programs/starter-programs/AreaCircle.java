package com.math.programes;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int radius;
	        double pi = 3.14, area;
	        Scanner s = new Scanner(System.in);//creating object s
	        System.out.print("Enter radius of circle:");//entering radius value from keyboard
	        radius = s.nextInt();
	        area = pi * radius * radius;//formula for calculating radius
	        System.out.println("Area of circle:"+area);//printing the value 
	}

}
