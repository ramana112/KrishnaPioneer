package com.flieprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("E:\\input.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: fileName");
        } catch (IOException e) {
            System.err.println("Unable to read the file: fileName");
        }

	}

}
