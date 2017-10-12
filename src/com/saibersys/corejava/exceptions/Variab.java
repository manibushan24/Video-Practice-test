package com.saibersys.corejava.exceptions;

public class Variab {

	int a=10, b=5;
	static void m1()
{
		System.out.println(new Variab().a);
		System.out.println(new Variab().b);
	}
	static void m2()
	{ 
		System.out.println(new Variab().a);
		System.out.println(new Variab().b);
		}
	public static void main(String[] args)
	{
		
	Variab.m1();
	Variab.m2();
	}

	}