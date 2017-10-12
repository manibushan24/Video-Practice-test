package com.saibersys.corejava.exceptions;

public class MethodOverload1 {

	public void add(int a)
	{
		System.out.println("0 argument");
		
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {

new MethodOverload1().add(5);
new MethodOverload1().add(10,20);
	}

}
