package com.saibersys.corejava.exceptions;
class X{}
class Y{}
class Z{}
public class Methods2 {

	void m1(X a, Y b)
	{
		System.out.println(a);
	}
	 static void m2 (Z c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
	Methods2 obj = new Methods2();
	obj.m1(new X(), new Y());
	Methods2.m2(new Z());
	
	}

}
