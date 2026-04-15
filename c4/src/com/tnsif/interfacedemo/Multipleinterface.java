package com.tnsif.interfacedemo;
//first interface
interface Camera{
	void takephoto();
}
//second interface
interface Musicplayer{
	void playmusic();
	
}
// a class implements multiple interface
class Smartphone implements Camera,Musicplayer{

	@Override
	public void playmusic() {
		System.out.println("playing music on the smart phone");
		
	}

	@Override
	public void takephoto() {
		System.out.println("taking photo using smart phone");
		
	}
	
}
public class Multipleinterface {
	public static void main(String[] args) {
		
	
	Smartphone s =new Smartphone();
	s.playmusic();
	s.takephoto();
	}
}
