package com.flieprograms;

import java.io.File;

public class FileHiddenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/input.txt");
	     
	     // this will check is the file hidden or not.
	     boolean blnHidden = file.isHidden();
	     
	     // return result in true or false condition.
	     System.out.println("Is the file " + file.getPath() + " hidden ?: " + blnHidden);

	}

}
