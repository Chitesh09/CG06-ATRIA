package com.tnsif.constructordemo;

public class Conexample {
	Conexample(){
		System.out.println("default constructor");
	}
	Conexample (int a,String b){
		System.out.println("2 parameter");
	}
	Conexample(int r ){
		System.out.println("1 parameter");
	}
	Conexample(int s,int b ,int d){
		System.out.println("3 parameter");
	}
	public static void main(String[]args) {
		Conexample c=new Conexample();
		Conexample c1=new Conexample(1,"hero");
		Conexample c2=new Conexample(9);
		Conexample c3=new Conexample(6,43,4);
	}

}
