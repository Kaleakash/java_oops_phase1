package com;
class AgeException extends Exception {
		
		public AgeException(String msg) {
						super(msg);			// to set message to Exception class using super(msg);
		}
}
public class ThrowKeyword {
	public static void main(String[] args) {
	int age =19;
	try {
			if(age<21) {
					//throw new Exception();		// generic exception 
					//throw new ArithmeticException();		//throw specific exception no message 
				//throw new ArithmeticException("age must be > 21");// throw specific exception with message. 
				//	throw new AgeException();		// user-defined exception but no message 
				throw new AgeException("age must be > 21");
			}
	} catch (AgeException e) {
		System.out.println("Exception "+e.toString());
	}
	}
}
