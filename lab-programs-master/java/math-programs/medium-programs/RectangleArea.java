package com.math.programs;
import java.util.Scanner;

public class RectangleArea {
	 public static void main(String args[])
	    {
	        int len, bre, peri, area;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Length and Breadth of Rectangle : ");
	        len = scan.nextInt();//storing the length
	        bre = scan.nextInt();//storing the breadth
			
	        area = len*bre;//formula for finding the area of rectangle
	        peri = 2*(len+bre);//formula for finding the perimeter of rectangle
			
	        System.out.print("Area = " +area);//printing the area 
			
	        System.out.print("\nPerimeter = " +peri);//printing the area
	        scan.close();//closing the object
	    }
}
