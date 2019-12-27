package org.Scanner;

import java.util.Scanner;

public class ScanClass {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the byte value");
	byte b=sc.nextByte();
	System.out.println("Enter the short Value");
	short ss=sc.nextShort();
	System.out.println("Enter the Int Value");
	int i=sc.nextInt();
	System.out.println("Enter the long Value");
	long l=sc.nextLong();
	System.out.println("Enter the float Value");
	float f=sc.nextFloat();
	System.out.println("Enter the douple Value");
	double d=sc.nextDouble();
	//System.out.println("Enter the boolean Value");
	//boolean bo=sc.nextBoolean();
	System.out.println("Enter the string Value");
	String s=sc.next();
	//System.out.println("Enter the next string Value");
	//String st=sc.nextLine();
	
	}	
}
