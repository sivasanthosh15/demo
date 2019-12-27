package org.polymorphis;

import org.samepack.Flowers;

public class MethodOverWrit extends Flowers{
	public void red() {
		System.out.println("Red Colour");
	}
	public void white() {
		System.out.println("White Colour");
	}
	public void blue() {
		System.out.println("Blue Colour");
	}
	public static void main(String[] args) {
		MethodOverWrit mow=new MethodOverWrit();
		mow.red();
		mow.white();
		mow.yellow();
		mow.blue();
	}

}
