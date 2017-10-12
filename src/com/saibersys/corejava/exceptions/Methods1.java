package com.saibersys.corejava.exceptions;

public class Methods1 {

	void m1(int a, String c)
	{
		System.out.println(a);
		System.out.println(c);
	}
	static void m2(double d, char ch)
	{
	System.out.println(ch);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Methods1 obj = new Methods1();
		obj.m1(10,"abc");
		Methods1.m2(1024.23, 'a');
	}

}
