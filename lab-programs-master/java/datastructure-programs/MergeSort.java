package ds.programs;

import java.util.Scanner;

public class MergeSort {
	 /* Merge Sort function */
    public static void sort(int[] arr, int low, int high) {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(arr, low, mid); 
        sort(arr, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) {
            if (i == mid)  
                temp[k] = arr[j++];
            else if (j == high) 
                temp[k] = arr[i++];
            else if (arr[j]<arr[i]) 
                temp[k] = arr[j++];
            else 
                temp[k] = arr[i++];
        }    
        for (int k = 0; k < N; k++) 
            arr[low + k] = temp[k];         
    }
    /* Main method */
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );        
        int num, i;
        /* Accept number of elements */
        System.out.println("Enter length of Array");
        num = scan.nextInt();
        /* Create array of n elements */
        int arr[] = new int[ num ];
        /* Accept elements */
        System.out.println("\nEnter "+ num +" integer elements");
        for (i = 0; i < num; i++)
            arr[i] = scan.nextInt();
        /* Call method sort */
        sort(arr, 0, num);
        /* Print sorted Array */
        System.out.println("\nElements after sorting ");        
        for (i = 0; i < num; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }    
}
	
