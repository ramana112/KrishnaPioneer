package com.array.medium.programes;

import java.util.Scanner;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		    Scanner sr = new Scanner (System.in);
		    System.out.print("Enter no. of elements you want in array:");
		    int n = sr.nextInt();

		    int array [] = new int[n];
		    System.out.println("Enter the elements of the array: ");
		    for(int i=0; i<n-1; i++){
		        array[i] = sr.nextInt();
		    }
		    for(int i=0;i<=array.length-1;i++){
		    	System.out.println("ArrayElements:"+array[i]);
		    }
		    for(int i=0; i<array.length; i++){
		        boolean isPrime = true;
		        for (int j=2; j<i; j++){
		            if(i%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		     
		        if(isPrime)

		            System.out.println(i + " is the prime number in the array ");
		    }
		}
		}
	
