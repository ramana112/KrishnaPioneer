package com.array.medium.programes;

import java.util.Scanner;

public class SecondLargestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an Array :");
        n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+arr[n-2]);
    }
}

