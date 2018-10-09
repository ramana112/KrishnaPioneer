package com.math.programs;
import java.util.Scanner;

public class Hcf {
	public static void main(String args[])
    {
        int a, b, x, y, t, hcf, lcm;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        x = scan.nextInt();//storing first number in x
        y = scan.nextInt();//storing second number in y
		
        a = x;//stroing x in a
        b = y;//stroing y in b
		
        while(b != 0)//checking b not equal to zero
        {
            t = b;//then place b value in t
            b = a%b;//perform modulo operation
            a = t;//store t value in a
        }
		
        hcf = a;//place a value in hcf
        lcm = (x*y)/hcf;//formula for lcm 
		
        System.out.print("HCF = " +hcf);//print hcf
        System.out.print("\nLCM = " +lcm);//print lcm
        scan.close();//closing the object
    }
}
