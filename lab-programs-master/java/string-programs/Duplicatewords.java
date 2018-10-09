package com.string.programs;

public class Duplicatewords {
	 
		/*static method to finding Duplicate Element*/
	
		private static void findCount(final String s, final String s1) { 

		int count = 0; 
		final String array[] = s.split(" "); 

		/*looping the each char in String */
		
		for (final String element : array) { 

		if (element.equalsIgnoreCase(s1)) { 

		count++; 
		} 

		} 
		
		/*printing the Dulicate word count*/
		
		System.out.println("the number of times" + s1 + "occurs is:" + count); 

		} 
		public static void main(final String args[]) { 

			final String str1 = "java technologies like core JAVA"; 
			final String str2 = "java"; 

			/*checking the strings*/
			
			findCount(str1, str2); 

			} 

		}
