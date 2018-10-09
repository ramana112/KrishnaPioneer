package com.string.programs;
import java.util.Arrays;  
public class Anagram {
	/*Static Method for checking Anagram isAnagram()*/
	 static void isAnagram(String str1, String str2) { 
		 	/*replaceing the characters of strings*/
		 
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        
	        /*checking the length of both strings*/
	        
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        }
	        else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        } 
	        /*if  status true then printing the string*/
	        
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	   
	    public static void main(String[] args) { 
	    	/*chedking two strings*/
	    	
	        isAnagram("Keep", "Peek");  
	        isAnagram("birds", "animals");  
	    }  
	}  




