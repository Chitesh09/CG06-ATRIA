package com.tnsif.polymorphism;
class calculator{
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(int a,double b) {
		return a+b;
	}
	int add(int a,int b) {
		return a+b;
	}
}
public class Methodoverloading {
	public static void main(String[]args) {
		calculator c=new calculator();
		System.out.println(c.add(1,2,3));
		System.out.println(c.add(2,2.2));
		System.out.println(c.add(5,8));
	}
}
