package com.flieprograms;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*Enter Folder name*/
		
		  	File file = new File("E:\\office");
		  	
		  	/*Taking Files into String*/
		  	
	        String[] files = file.list(new FilenameFilter() {
	             
	            @Override
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith(".css")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:files){
	            System.out.println(f);
	        }
	}
}