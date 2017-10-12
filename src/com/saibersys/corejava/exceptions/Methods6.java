package com.saibersys.corejava.exceptions;

public class Methods6 {
	Methods6 m1()
	{    
		System.out.println("m1 method");
		 Methods6 obj = new Methods6();
		return obj;
	}
	Methods6 m2()
	{
		System.out.println("m2 method");
	return this;
	}

	public static void main(String[] args) {
		Methods6 obj = new Methods6();
		Methods6 x = obj.m1();
		Methods6 y = obj.m2();
	}

}
