package com;

import java.io.DataInputStream;
import java.io.PrintStream;

public class ByteWiseKeyboardAndMonitor {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		PrintStream ps = System.out;
		ps.print("Enter the value");
		String name = dis.readLine();
		System.out.println("Name is "+name);
		
	}

}
