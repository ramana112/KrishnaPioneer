package com.math.programes;

public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number , originalNumber= 371, remainder, result = 0;

	        number=originalNumber ;//storing the original number in another variable

	        while ( number != 0)//checking that number is equal to zero or not
	        {
	            remainder =  number % 10;//calculating modulus value
	            result += Math.pow(remainder, 3);//calculation result
	             number /= 10;//performing division
	        }

	        if(result == originalNumber)//checking whether the given result is equal to original number or not 
	            System.out.println(originalNumber + " is an Armstrong number.");//printing if the given number is amstrong 
	        else
	            System.out.println(originalNumber + " is not an Armstrong number.");//printing if the given number is not an amstrong

	}

}
