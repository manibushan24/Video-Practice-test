package com.saibersys.corejava.exceptions;

public class Var {

		int a=10, b=5;
		static int c=1, d=2;
	    
		void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Var.c);
	    System.out.println(Var.d);
	}

	    
		static void m2(){
			Var obj = new Var();	
			System.out.println(obj.a);
			System.out.println(obj.b);
			System.out.println(Var.c);
		    System.out.println(Var.d);
		}

	public static void main(String[] args)
	{
		Var obj = new Var();
		obj.m1();
	Var.m2();
	}

	}
