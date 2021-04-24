package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ByteWiseKeyboardAndStoreInFile {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(System.in);	// reference to take value through keyboards 
		FileOutputStream fos = new FileOutputStream("abc.txt",true);	//that class help to store in file. 
		System.out.println("Enter the data");
		int ch;
		while((ch=dis.read()) != '\n') {		// Akash
			System.out.print(ch);
			fos.write(ch);
		}
	}

}
