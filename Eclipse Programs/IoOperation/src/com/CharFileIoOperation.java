package com;

import java.io.FileReader;
import java.io.FileWriter;

public class CharFileIoOperation {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\Demo.java");
		FileWriter fw = new FileWriter("D:\\demo123.txt");
		int ch;
		while((ch=fr.read()) != -1) {
			fw.write(ch);
			System.out.print((char)ch);
		}
		fw.flush();
	}

}
