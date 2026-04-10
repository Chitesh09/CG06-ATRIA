package com.tnsif.statickeyworddemo;
class student{
	String name;
	int id;
	static String collegename="Atria";
	public student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	void showdetails() {
		System.out.println(" Student "+ name +" id "+ id +" collegename "+ collegename);
	}
	
}
public class Staticvariabledemo {
	public static void main(String[] args) {
		student s1=new student("guru",2);
		student s2=new student("hi",3);
		student s3=new student("gu",4);
		student s4=new student("ru",5);
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
		s4.showdetails();
	}

}
