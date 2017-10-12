package com.saibersys.corejava.exceptions;

public class Assignmentube1 {
 int a=10;
 float f= 10.2f;
 static double d = 234.56;
 static int b = 10;
  void m1()
  {
	  System.out.println(a);
  System.out.println(f);
  System.out.println(Assignmentube1.d);
  System.out.println(Assignmentube1.b);

  }
 
	static void m2()
	{ Assignmentube1 object = new Assignmentube1();
		System.out.println(object.a);
		System.out.println(object.f);
	System.out.println(d);
	System.out.println(b);
	}
	public static void main(String[] args) {
	Assignmentube1 object = new Assignmentube1(); 
	object.m1();	
	  Assignmentube1.m2();
	
	}

}
