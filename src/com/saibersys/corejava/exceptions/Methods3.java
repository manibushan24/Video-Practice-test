package com.saibersys.corejava.exceptions;

public class Methods3 {
	
	public void m1()
	{      m2();
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	m3();}
	public void m3()
	{
		System.out.println("m3 method");
	}
	

	public static void main(String[] args) {
		Methods3 obj = new Methods3();
		obj.m1();
	}

}
