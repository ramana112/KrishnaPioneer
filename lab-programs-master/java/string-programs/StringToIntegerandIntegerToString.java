package com.string.programs;

public class StringToIntegerandIntegerToString {
	
	public static void main(String args[]){  
		
		String str="200";  
		int i=300; 
		/*converting string to int using valueofmethod()*/
		
		Integer a=Integer.valueOf(str); 
		
		/*converting intiger to string to*/
		
		String st=String.format("%d",i);    
		
		System.out.println(a);  
		System.out.println(st);
	}
}
