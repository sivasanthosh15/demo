package org.polymorphis;

public class MethodOverLoadd {
	public void employee(int id) {
		System.out.println(id);
	}
	public void employee(String name,int id) {
		System.out.println(name);
		System.out.println(id);
	}
	public void employee(long phone, String name) {
		System.out.println(phone);
		System.out.println(name);
	}
	public void employee(String email,int id,long phone) {
		System.out.println(id);
		System.out.println(phone);
		System.out.println((email));
	}
	public static void main(String[] args) {
		MethodOverLoadd mol=new MethodOverLoadd();
		mol.employee(9500729, "siva");
		mol.employee(12125);
		mol.employee("sivavis@gmail.com", 12125, 9500729);
		
	}

}
