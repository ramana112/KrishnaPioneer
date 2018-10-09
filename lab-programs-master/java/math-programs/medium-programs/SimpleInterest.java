package com.math.programs;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float p, r, t;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the Principal : ");
	        p = s.nextFloat();//storing principal value in p
	        System.out.print("Enter the Rate of interest : ");
	        r = s.nextFloat();//storing rate of interest value in r
	        System.out.print("Enter the Time period : ");
	        t = s.nextFloat();//storing time value in t
	        float si;
	        si = (r * t * p) / 100;//formula
	        System.out.print("The Simple Interest is : " + si);//printing the simple interest value
	        s.close();//closing the object
	}

}
