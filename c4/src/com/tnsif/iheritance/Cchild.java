package com.tnsif.iheritance;

public class Cchild  extends Bchild{
	int c=30;
	String name3="herlin";
	void read3() {
		System.out.println("class c");
		
	}
	public static void main(String[]args) {
		Cchild c = new Cchild();
		System.out.println(c.a);
		System.out.println(c.b);
		c.read();
		c.read2();
		c.read3();
		
		System.out.println(c.name);
		System.out.println(c.name2);
		System.out.println(c.name3);
		
	}

}
