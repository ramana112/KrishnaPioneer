package com.array.stater.programs;

public class PrintOddNumsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};//initialization of elements in an array
		  for (int i = 0; i<=arr.length-1; i++) {
		   if (arr[i] % 2 != 0)//condition for the odd numbers
		    System.out.println(arr[i]+"is Odd Number");//printing odd numbers in an array
		  }
		 }
}
