package com.array.stater.programs;

import java.util.Scanner;

public class PrintAlternateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i, count;
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter the Length of Array");
		  count = scan.nextInt();//stores the length of the array in count variable
		  int a[] = new int[count];
		  for (i = 0; i < count; i++) {
		   System.out.print("Enter number " + (i + 1));
		   a[i] = scan.nextInt();//entered elements are stored in an array
		  }
		  scan.close();//object closing
		  System.out.print("\nOriginal array is :\t");
		  for (i = 0; i < count; i++)
		   System.out.print(a[i] + "\t");//printing the original array

		  System.out.print("\n\nAlternate elements :\t");
		  for (i = 0; i < count; i = i + 2)
		   System.out.print(a[i] + "\t");//printing the alternate elements in an array
		 }
		}
	