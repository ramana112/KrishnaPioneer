package com.string.programs;
import java.util.HashMap;  
import java.util.Map;  
import java.util.Set;  

public class DuplicateCharFinder {  
	
	/*method to find delicate */
    public void findIt(String str) {  
    	
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>(); 
        
        /*converting to character Array*/
        
        char[] charArray = str.toCharArray(); 
        
         /*looping the each char in array*/
        
        for (Character ch : charArray) {  
            if (baseMap.containsKey(ch)) {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            }
            else {  
                baseMap.put(ch, 1);  
            }  
        }  
        
        
        Set<Character> keys = baseMap.keySet();  
        
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }  
    }  
   
    public static void main(String a[]) {  
    	
    	/*creating the object of Duplicate Array*/
    	
        DuplicateCharFinder dcf = new DuplicateCharFinder();  
        dcf.findIt("India is my country");  
    }  
}  


