package com.saibersys.corejava.exceptions;

public class Assignmentube {

	int a=10;
	int b=20;
	
	static void m1()
	{
		Assignmentube obj = new Assignmentube();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}
	static void m2()
	{ Assignmentube obj = new Assignmentube();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	public static void main(String[] args) {
	
  Assignmentube.m1();
  
  Assignmentube.m2();	}

}
