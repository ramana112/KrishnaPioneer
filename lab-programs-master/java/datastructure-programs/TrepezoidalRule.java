package ds.programs;

import java.util.Scanner;

public class TrepezoidalRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      double   area;      // Store result in area
		      double   leftendPoint, rightendpoint;      // Left and right endpoints
		      int      num;         // Number of trapezoids
		      double   baseWidth;         // Trapezoid base width

		      Scanner sc = new Scanner(System.in);

		      System.out.println("Enter a, b, and n");
		      leftendPoint = sc.nextDouble();
		      rightendpoint = sc.nextDouble();
		      num = sc.nextInt();

		      baseWidth = (rightendpoint-leftendPoint)/num;
		      area = trap(leftendPoint, rightendpoint,  num, baseWidth);

		      System.out.println("With n = " +  num + " trapezoids, our estimate");
		      System.out.print("of the area from " + leftendPoint + " to " + rightendpoint);
		      System.out.println(" = " + area);
		      
		   }  // main

		   // Method:       trap
		   // Purpose:      Estimate area using the trapezoidal rule
		   // Input args:   a: left endpoint
		   //               b: right endpoint
		   //               n: number of trapezoids
		   //               h: stepsize = length of base of trapezoids
		   // Return val:   Trapezoidal rule estimate of area between x-axis,
		   //               x = a, x = b, and graph of f(x)
		   // Note:         Need *static* so trap can be called from main without 
		   //               instantiating an object
		   static double trap(double a, double b, int n, double h) {
		       double area;   // Store result in area 
		       double x;
		       int i;
		   
		       area = (f(a) + f(b))/2.0;
		       for (i = 1; i <= n-1; i++) {
		           x = a + i*h;
		           area = area + f(x);
		       }
		       area = area*h;
		   
		       return area;
		   } //  trap  


		   // Method:     f
		   // Purpose:    Compute value of function being integrated
		   // Input arg:  x
		   // Note:       Need *static* so f can be called from trap without 
		   //             instantiating an object
		   static double f(double x) {
		      double return_val;  
		   
		      return_val = x*x + 1;
		      return return_val;
		
	}

}
