package com.saibersys.corejava.exceptions;

public class Methods {

	void m1()
	{
		System.out.println("hello");
	}
	static void m2()
	{
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		
			Methods obj = new Methods();	
obj.m1();
Methods.m2();
	}
	
}
