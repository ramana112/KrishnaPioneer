package com.math.programs;
public class Operations {

	 public static void main (String[] args) {

	        int result = 1 + 2;//performing addition
	        System.out.println("1 + 2 = " + result);
	        int original_result = result;

	        result = result - 1;//performing subtraction
	        System.out.println(original_result + " - 1 = " + result);
	        original_result = result;

	        result = result * 2;//performing multiplication
	        System.out.println(original_result + " * 2 = " + result);
	        original_result = result;

	        result = result / 2;//performing division
	        System.out.println(original_result + " / 2 = " + result);
	        original_result = result;

	        result = result + 8;//performing addition
	        System.out.println(original_result + " + 8 = " + result);
	        original_result = result;

	        result = result % 7;//performing modulo
	        System.out.println(original_result + " % 7 = " + result);
	    }
}
