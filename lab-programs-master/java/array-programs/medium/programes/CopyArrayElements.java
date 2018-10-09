package com.array.medium.programes;

public class CopyArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[] = { 1, 2, 3, 4, 5, 6 };
	        int arr2[] = new int[arr1.length];
	        System.out.println("CopyOfAnArray:");
	        for (int i = 0; i < arr1.length; i++) {
	            arr2[i] = arr1[i];
	            
	            System.out.println(arr2[i]);
	            
	        }
	    }
	}

