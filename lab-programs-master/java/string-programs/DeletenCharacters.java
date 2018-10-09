package com.string.programs;

public class DeletenCharacters {
	 
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);
	}
}
