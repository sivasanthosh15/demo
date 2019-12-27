package org.inheritan;

import org.samepack.Flowers;

public class SingleInher extends Flowers {
	public void cbsc() {
		System.out.println("CBSC");
	}
	public void matriculation() {
		System.out.println("MATRICULATION");
	}
	public void stateBoard() {
		System.out.println("STATE BOARD");
	}
	public static void main(String[] args) {
		SingleInher	s=new SingleInher();
		s.cbsc();
		s.matriculation();
		s.stateBoard();
		
		s.red();
		s.white();
		s.yellow();
		

}}
