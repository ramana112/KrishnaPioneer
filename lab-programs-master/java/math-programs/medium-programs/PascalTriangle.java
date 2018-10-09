package com.math.programs;
import java.util.Scanner;
public class PascalTriangle {
	public static void main(String args[])
	{
	    int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);//creating object
		
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();//stroing the number of rows in r variable
		
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");//printin empty other than the elements in the traingle shape
			}
            number = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);//printing the elements based on considering the number of rows
			}
			System.out.println();
		}
		scan.close();//closing the object
	}
}
