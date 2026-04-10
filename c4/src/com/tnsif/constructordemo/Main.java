package com.tnsif.constructordemo;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the person name :");
		String name=sc.next();
		System.out.print("enter the income :");
		int age=sc.nextInt();
		System.out.println("enter your address: ");
		String address=sc.next();
		
		student pp=new student();
		pp.setName(name);
		pp.setAge(age);
		pp.setAddress(address);

}
}
