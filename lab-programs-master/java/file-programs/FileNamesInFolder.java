package com.flieprograms;

import java.io.File;

public class FileNamesInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Enter the folder name*/
		
		 File file = new File("E:\\office");
		 
		 /*storing file in a string Array*/
		
	     String[] fileList = file.list();
	     
	     /*counting files using for each */
	     for(String name:fileList){
	     System.out.println(name);
		
	}

}
}
