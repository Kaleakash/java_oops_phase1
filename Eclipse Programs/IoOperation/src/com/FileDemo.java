package com;

import java.io.File;

public class FileDemo {

	public static void main(String[] args)  throws Exception{
		//File class is use to check the specific folder or file properties. 
		File ff = new File("D:\\Demo");
		System.out.println(ff.isDirectory());
		System.out.println(ff.isFile());
	}

}
