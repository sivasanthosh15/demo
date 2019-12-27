package org.abstracts;

public class TNFuelPrice implements FullyAbstract {

	@Override
	public void petrolPrice() {
		// TODO Auto-generated method stub
		System.out.println("75");
		
	}

	@Override
	public void diesalPrice() {
		// TODO Auto-generated method stub
		System.out.println("65");
	}

	@Override
	public void oilPrice() {
		// TODO Auto-generated method stub
		System.out.println("55");
	}
	public static void main(String[] args) {
		TNFuelPrice tn=new TNFuelPrice();
		tn.petrolPrice();
		tn.diesalPrice();
		tn.oilPrice();
	}
	

}
