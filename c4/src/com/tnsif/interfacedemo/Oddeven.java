package com.tnsif.interfacedemo;
import java.util.Scanner;

public class Oddeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. ");
		
		int num =sc.nextInt();
		
		if(num%2==0) {
			System.out.print(num+" " +"is a odd no.");
		}
		else {
			System.out.print(num+ " " +"is an even no.");
		}
	}

}
