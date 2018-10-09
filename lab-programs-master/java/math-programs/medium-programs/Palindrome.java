package com.math.programs;
import java.util.Scanner;

public class Palindrome {
	 public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner sc = new Scanner(System.in);//creating an object
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();//stroing string value in str variable
	 
	      int length = str.length();//calculating the length of the string and stroing in length variable
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);//reversing the string
	 
	      if (str.equals(rev))//checking whether the given string is equal to reversed string
	         System.out.println(str+" is a palindrome");//printing that the string is palindrome
	      else//if not
	         System.out.println(str+" is not a palindrome");//printing that the string is not a palindrome
	    sc.close();//closing the object
	   }
}
