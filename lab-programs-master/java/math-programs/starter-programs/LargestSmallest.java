package com.math.programes;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LargestSmallest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 //create buffer to capture input
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        //define list and integers
        ArrayList list = new ArrayList();
        int length, largest, smallest, number;
 
        System.out.println("Enter the limit (Better give below 10): ");
        length = Integer.parseInt(in.readLine());//storing the limit in the length variable
 
        System.out.println("Now enter the list:");
 
        for (int i = 0; i < length; i++) {
            list.add(Integer.parseInt(in.readLine()));//stroing the list elements
        }
 
        largest = (int) list.get(0);//considering the first element is largest
        smallest = (int) list.get(0);//considering the first element is smallest
 
        for (Object list1 : list) {
            number = (int) list1;
            if (number > largest) {//checking the condition that number is greater than largest
                largest = number;//if greater assiging the number to largest
            } else if (number < smallest) {//checking the condition that number is less than samllest
                smallest = number;//if lesser assiging the number to smallest
            }
        }
        System.out.println("Largest Number is : " + largest);//printing the largest element
        System.out.println("Smallest Number is : " + smallest);//printing the smallest element
    }
	}


