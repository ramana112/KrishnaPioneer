package com.flieprograms;

import java.io.File;

public class SetFilePermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	File scriptFile = new File("E:\\input.txt");
	        System.out.println("Current file permissions:");
	        System.out.println("Can Execute? "+scriptFile.canExecute());
	        System.out.println("Can Read? "+scriptFile.canRead());
	        System.out.println("Can Write? "+scriptFile.canWrite());
	        scriptFile.setExecutable(true);
	        scriptFile.setReadable(true);
	        scriptFile.setWritable(true);
	        System.out.println("Now file permissions:");
	        System.out.println("Can Execute? "+scriptFile.canExecute());
	        System.out.println("Can Read? "+scriptFile.canRead());
	        System.out.println("Can Write? "+scriptFile.canWrite());

	}

}
