package com.flieprograms;

import java.io.File;

public class DeleteAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\NewFile.txt");
        
        if(file.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("Failed to delete the file");
        }
	}

}
