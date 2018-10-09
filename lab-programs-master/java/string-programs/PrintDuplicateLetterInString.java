package com.string.programs;

public class PrintDuplicateLetterInString {
	public static void main(String[] args) { 

		String p="pioneer coders"; 
		int count=0; 
		
		/*converting to string to char Array*/
		char [] input = p.toCharArray(); 
		System.out.println("Duplicate Characters are:"); 
		
		/*checking the each element of string*/
		
		for(int i=0;i<p.length();i++){ 
			
			for(int j=i+1;j<p.length();j++){ 
				
				if(input[i]==input[j]) { 
					System.out.println(input[j]); 
					count ++; 
					break; 
				} 
			} 
		} 
	}
}