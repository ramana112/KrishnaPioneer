package com.array.medium.programes;

import java.util.Scanner;

public class InsertElementInSpecifiedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, pos, x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of An array:");
        n = scan.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        pos = scan.nextInt();
        System.out.print("Enter the element you want to insert:");
        x = scan.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}

