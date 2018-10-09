package com.array.medium.programes;

import java.util.Scanner;

public class ArrayElementsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n, sum = 0;
	        Scanner sr = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = sr.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = sr.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println("Sum:"+sum);
	    }
	}

