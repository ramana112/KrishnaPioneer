package com.math.programs;
import java.util.Scanner;

public class Multiplication {
	public static void main(String args[])
	   {
	      int m, n, p, q, mul = 0, c, d, k;
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the number of rows and columns of first matrix");
	      m = in.nextInt();//stroing number of rows in m
	      n = in.nextInt();//stroing number of columns in n
	 
	      int first[][] = new int[m][n];//storing first matrix in first array
	 
	      System.out.println("Enter the elements of first matrix");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            first[c][d] = in.nextInt();//storing first matrix elements, that are recieved from keyboard 
	 
	      System.out.println("Enter the number of rows and columns of second matrix");
	      p = in.nextInt();//stroing number of rows in p
	      q = in.nextInt();//stroing number of rows in q
	 
	      if ( n != p )
	         System.out.println("Matrices with entered orders can't be multiplied with each other.");
	      else
	      {
	         int second[][] = new int[p][q];//storing second matrix in second array
	         int multiply[][] = new int[m][q];//storing multiply value in multiply array
	 
	         System.out.println("Enter the elements of second matrix");
	 
	         for ( c = 0 ; c < p ; c++ )
	            for ( d = 0 ; d < q ; d++ )
	               second[c][d] = in.nextInt();//storing second matrix elements, that are recieved from keyboard
	 
	         for ( c = 0 ; c < m ; c++ )
	         {
	            for ( d = 0 ; d < q ; d++ )
	            {   
	               for ( k = 0 ; k < p ; k++ )
	               {
	                  mul = mul + first[c][k]*second[k][d];//perform multiplication and store in sumvaraible
	               }
	 
	               multiply[c][d] = mul;//the value in the mul is assiged to  multiply array
	               mul= 0;//again initialize mul to zero
	            }
	         }
	 
	         System.out.println("Product of entered matrices:-");
	 
	         for ( c = 0 ; c < m ; c++ )
	         {
	            for ( d = 0 ; d < q ; d++ )
	               System.out.print(multiply[c][d]+"\t");//printing product of two matrices
	 
	            System.out.print("\n");//to go to the next line
	         }
	      }
	      in.close();//closing the object
	   }
}
