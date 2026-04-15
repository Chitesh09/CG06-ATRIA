package com.tnsif.interfacedemo;

interface Smartdevice{
	void turnon();
	void turnoff();
	void getStatus();
}
class Smartlight implements Smartdevice{

	@Override
	public void turnon() {
		System.out.println("light on");
		
	}

	@Override
	public void turnoff() {
		System.out.println("light off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("light is in steady mode");
	}
	
}
public class Interfacedemo {
	public static void main(String[] args) {
		Smartlight s =new Smartlight();
		s.turnon();
		s.turnoff();
		s.getStatus();
	}

}
