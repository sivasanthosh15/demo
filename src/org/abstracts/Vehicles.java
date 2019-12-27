package org.abstracts;

public class Vehicles extends PartiallyAbstra {
	@Override
	public void threeWheeler() {
		// TODO Auto-generated method stub
		System.out.println("Bajaj");	
	}

	@Override
	public void FourWheeler() {
		// TODO Auto-generated method stub
		System.out.println("Ashok Leyland");
	}
	public static void main(String[] args) {
		Vehicles v=new Vehicles();
		v.twoWheeler();
		v.threeWheeler();
		v.FourWheeler();

	

}

}
