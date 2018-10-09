package com.math.programs;
import java.util.Random;
import java.util.Scanner;

public class Permutation {

	 static void permute(int[] a, int k) 
	    {
	        if (k == a.length) //checking that array length is equal to key 'k' or not
	        {
	            for (int i = 0; i < a.length; i++) 
	            {
	                System.out.print(" [" + a[i] + "] ");//printing the elements in the array
	            }
	            System.out.println();
	        } 
	        else //otherwise
	        {
	            for (int i = k; i < a.length; i++) 
	            {
	                int temp = a[k];//storing that key value in temp variable--swaping is performed
	                a[k] = a[i];
	                a[i] = temp;
	 
	                permute(a, k + 1);//calling the function and with the result again perform swaping
	 
	                temp = a[k];
	                a[k] = a[i];
	                a[i] = temp;
	            }
	        }
	    }
	 
	    public static void main(String args[]) 
	    {
	        Random random = new Random();//creating random object
	        Scanner sc = new Scanner(System.in);//creating sc object 
	        System.out.println("Enter the length of list: ");
	        int N = sc.nextInt();//storing the list length in N variable 
	        int[] sequence = new int[N];
	 
	        for (int i = 0; i < N; i++)
	            sequence[i] = Math.abs(random.nextInt(100));//finding the absolute value
	 
	        System.out.println("The original sequence is: ");
	        for (int i = 0; i < N; i++)
	            System.out.print(sequence[i] + " ");//printing the sequence
	 
	        System.out.println("\nThe permuted sequences are: ");//printing the permuted sequence
	        permute(sequence, 0);//calling the method
	 
	        sc.close();//closing the object
	    }

}
