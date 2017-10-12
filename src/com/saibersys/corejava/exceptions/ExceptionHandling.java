package com.saibersys.corejava.exceptions;

public class ExceptionHandling {
	
	public static void domorestuff()
	{
		System.out.println("hello");
	}
	public static void dostuff()
	{
	
	domorestuff();
	System.out.println("hi");
	}
	
	

	public static void main(String[] args) {
		dostuff();
		System.out.println(10/0);
	}

}
