package org.samepack;

public class Flowers {
	public void red() {
		System.out.println("Rose");
	}
	public void white() {
		System.out.println("Lavender");
	}
	public void yellow() {
		System.out.println("SunFlower");
	}
	public static void main(String[] args) {
		Flowers f=new Flowers();
		
		f.red();
		f.white();
		f.yellow();
		
		Animals a=new Animals();
		a.hills();
		a.forest();
	}

}
