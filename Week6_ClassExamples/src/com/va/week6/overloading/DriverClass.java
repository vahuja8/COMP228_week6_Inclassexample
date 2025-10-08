package com.va.week6.overloading;

public class DriverClass {
	
	public static void main(String[] args)
	{
		Helper h1 = new Helper();
		
		System.out.println(h1.Multiply(33.1, 12.1));
		System.out.println(h1.Multiply(3, 12));
	}

}
