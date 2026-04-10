package com.tnsif.polymorphism;
class human{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name:"+name);
	}
	
}
public class Person {
	public static void main(String[]args) {
		human h = new human();
		h.setName("Mentos");
		h.getName();
		h.display();
	}

}
