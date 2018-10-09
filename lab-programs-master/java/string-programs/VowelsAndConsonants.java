package com.string.programs;

public class VowelsAndConsonants {
	public static void main(String[] args) {
        String line = "This website is aw3som3.";
        
        int vowels = 0, consonants = 0;

        line = line.toLowerCase();
        
        /*checking for vowels  */
        
        for(int i = 0; i < line.length(); ++i){
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            
            }
        /*pring vowles and consonants count*/
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
       
}
}