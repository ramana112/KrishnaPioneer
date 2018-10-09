package com.flieprograms;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// enter the file name.
		File file = new File("E:/input.txt");

		// calculate the size of the file.
		long fileSize = file.length();

		// return the file size in bytes,KB and MB.
		System.out.println("File size in bytes is : " + fileSize);
		System.out.println("File size in KB is : " + (double)fileSize/1024);
		System.out.println("File size in MB is : " + (double)fileSize/(1024*1024));
	}

}
