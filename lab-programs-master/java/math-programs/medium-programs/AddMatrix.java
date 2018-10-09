package com.math.programs;
import java.util.Scanner;

public class AddMatrix {

	 public static void main(String args[])
	   {
	      int m, n, c, d;
	      Scanner in = new Scanner(System.in);//creating object 
	 
	      System.out.println("Enter the number of rows and columns of matrix");
	      m = in.nextInt();//stroing number of rows in m
	      n  = in.nextInt();//stroring number of columns in n
	 
	      int first[][] = new int[m][n];//storing first matrix in first array
	      int second[][] = new int[m][n];//storing second matrix in second array
	      int sum[][] = new int[m][n];//storing sum value in sum array
	 
	      System.out.println("Enter the elements of first matrix");
	 
	      for (  c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            first[c][d] = in.nextInt();//storing first matrix elements, that are recieved from keyboard 
	 
	      System.out.println("Enter the elements of second matrix");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            second[c][d] = in.nextInt();//storing second matrix elements, that are recieved from keyboard
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
	 
	      System.out.println("Sum of entered matrices:-");
	 
	      for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+"\t");//printing the sum of two matrices
	 
	         System.out.println();
	      }
	      in.close();//closing the object
	   }
}
