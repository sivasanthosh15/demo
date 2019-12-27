package org.differentpack;

import org.samepack.Flowers;

public class Foods extends Flowers  {
	public void morning() {
		System.out.println("BreakFast");
	}
	public void afterNoon() {
		System.out.println("Lunch");
	}
	public void night() {
		System.out.println("Dinner");
	}
	public static void main(String[] args) {
		Foods f=new Foods();
		f.morning();
		f.afterNoon();
		f.night();
		
		Flowers s=new Flowers();
		s.red();
		s.white();
		s.yellow();
	}

}
