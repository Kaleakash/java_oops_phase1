package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyUsingByteWise {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:\\Demo.java");
		FileOutputStream fos = new FileOutputStream("D:\\demo.docx");
		int ch;
		while((ch=fis.read()) != -1) {		//-1 EOF
			System.out.print((char)ch);
			fos.write(ch);					// storing in file byte wise. 
		}
		System.out.println("File copied...");
	}

}
