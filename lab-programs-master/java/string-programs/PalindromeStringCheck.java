package com.string.programs;

import java.util.Scanner;

public class PalindromeStringCheck {
	
	 public static void main(String args[]){
	      String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      /*Taking String from user*/
	      
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	      
	      int length = str.length();
	      
	      /*checking reverse of string*/
	      
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	      
	      /*if reverse of string equal to the enterd string then it  is palindrome*/
	      
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
}
