package com.flieprograms;

import java.io.File;
import java.sql.Date;

public class LastModifionFlie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Enter the file name here.
		File file = new File("E:/Input.txt");

		// lastModified is the predefined function of date class in java.
		long lastModified = file.lastModified();

		// will print when the file last modified.
		System.out.println("File was last modified at : " + new Date(lastModified));
	}

}
