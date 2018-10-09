package com.math.programs;
import java.util.Scanner;
public class Triangle {
	 public static void main(String args[]) {   
	      Scanner scanner = new Scanner(System.in);

	      System.out.println("Enter the width of the Triangle:");
	      double base = scanner.nextDouble();//stroing the width

	      System.out.println("Enter the height of the Triangle:");
	      double height = scanner.nextDouble();//stroing the height

	      //Area = (width*height)/2
	      double area = (base* height)/2;//formula
	      System.out.println("Area of Triangle is: " + area);  //printing the area
	      scanner.close();//closing the object
	   }
}
