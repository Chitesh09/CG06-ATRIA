package com.tnsif.statickeyworddemo;
class UPIAPP{
	 final int max=10000;
	void showlimit(){
		System.out.println("Amount "+max);
		
	}
}
public class Finalvariable {
	public static void main(String[] args) {
		UPIAPP up=new UPIAPP();
		up.showlimit();
		up.max=20000;
	}

}
