package com.math.programs;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
        double root1, root2, d;
        Scanner s = new Scanner(System.in);//creating an object
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
        a = s.nextInt();//storing a value 
        System.out.print("Enter b:");
        b = s.nextInt();//stroing b value
        System.out.print("Enter c:");
        c = s.nextInt();//stroing c value
        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;//calculating the discreminant value
        if(d > 0)//if d greater than zero
        {
            System.out.println("Roots are real and unequal");
            root1 = ( - b + Math.sqrt(d))/(2*a);//formula
            root2 = (-b - Math.sqrt(d))/(2*a);//fromula
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(d == 0)//d equal to zero
        {
            System.out.println("Roots are real and equal");
            root1 = (-b+Math.sqrt(d))/(2*a);//formula
            System.out.println("Root:"+root1);
        }
        else
        {
            System.out.println("Roots are imaginary");//roots are imagianry
        }
        s.close();//closing the object
	}

}
