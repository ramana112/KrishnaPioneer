package com.string.programs;

public class SwapTwoStrings {
	 		public static void main(String args[]) {  
	 		
	        String str1 = "pioneer";  
	        String str2= "coders"; 
	        System.out.println("Before swap: " + str1 + " " + str2)  ;
	        str1 = str1+ str2;  
	        str2 = str1.substring(0, str1.length() - str2.length());  
	        str1 = str1.substring(str2.length());  
	        System.out.println("After : " + str1 + " " + str2);  
	 }
}
