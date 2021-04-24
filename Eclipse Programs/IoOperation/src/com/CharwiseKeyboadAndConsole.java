package com;

import java.io.*;


public class CharwiseKeyboadAndConsole {
	public static void main(String[] args) throws Exception{
			//InputStreamReader dis = new InputStreamReader(System.in);
			//BufferedReader br = new BufferedReader(dis);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name");
			String name = br.readLine();
			System.out.println("Name is "+name);
			System.out.println("Enter the id");
			int id = Integer.parseInt( br.readLine());	//	"10"
			//Integer is a pre-defined class part of lang package parseInt() static method help to 
			//convert string to int 
			System.out.println("id is "+id);
	}
}
