package ds.programs;

import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size, temp;
	        Scanner s = new Scanner(System.in);
	        /*Declaring size of any Array*/
	        
	        System.out.print("Enter the Size of array:");
	        size= s.nextInt();
	        int arr[] = new int[size];
	        /*Enter elements of Array*/
	        
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = s.nextInt();
	        }
	        /*Accessing each element in an array and sorting using temp variable*/
	        
	        for (int i = 0; i < size; i++) {
	            for (int j = i + 1; j < size; j++) 
	            {
	                if (arr[i] > arr[j]){
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        /*printing the sorted Array*/
	        
	        System.out.print("Ascending Order:");
	        for (int i = 0; i < size - 1; i++) {
	            System.out.print(arr[i] + ",");
	        }
	        System.out.print(arr[size - 1]);
	    }
	}


