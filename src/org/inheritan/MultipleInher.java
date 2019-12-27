package org.inheritan;

import org.differentpack.Foods;

public class MultipleInher extends Foods {
	public void tamilBooks() {
		System.out.println("Tamil");
	}
	public void englishBooks() {
		System.out.println("English");
	}
	public void scienceBooks() {
		System.out.println("Science");
	}
	public static void main(String[] args) {
		MultipleInher mi=new MultipleInher();
		mi.tamilBooks();
		mi.englishBooks();
		mi.scienceBooks();
		
		mi.morning();
		mi.afterNoon();
		mi.night();
		
		mi.red();
		mi.white();
		mi.yellow();
	}
}