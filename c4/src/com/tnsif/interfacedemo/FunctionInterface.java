package com.tnsif.interfacedemo;

interface Beta{
	void Masti();
	void Grandmasti();
}
class Movie implements Beta{

	@Override
	public void Masti() {
		System.out.println("yoooo");
		
	}

	@Override
	public void Grandmasti() {
		System.out.println("ohhhh yesss");
		
	}
	
}
public class FunctionInterface {
	public static void main(String[] args) {
	Movie m = new Movie();
	m.Masti();
	m.Grandmasti();
	}
	
}
