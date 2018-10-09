package com.flieprograms;

import java.io.File;

public class FindFileSizeAndPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final String fileName="input.txt";
	        try {
	            //File Object
	            File objFile=new File(fileName);
	             
	            //getting file path
	            System.out.println("File path is: " + objFile.getAbsolutePath());
	            //getting filesize
	            System.out.println("File size is: " + objFile.length() + " bytes.");
	        }
	        catch (Exception Ex){
	            System.out.println("Exception: "+ Ex.toString());
	        }
	}

}
