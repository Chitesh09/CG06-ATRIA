package com.tnsif.exceptionhandling;

public class Multiplecatchblock {
	public static void main(String[] args) {
		int number[]=new int[4];
		try {
			int i=number[8];
			System.out.println("world");
		}
		catch(ArithmeticException h) {
			System.out.println("welcome");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array error");
		}
	}

}
