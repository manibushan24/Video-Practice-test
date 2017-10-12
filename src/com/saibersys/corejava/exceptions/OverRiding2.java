package com.saibersys.corejava.exceptions;

public class OverRiding2 extends OverRiding1{

	 public void m2()
	{
		System.out.println("overriden method");
	
	}
	 public int multiply(int a, int b)
	 {
		 System.out.println(a*b);
		 return a*b;
	 }
	public static void main(String[] args) {
OverRiding1 p = new OverRiding2();
p.m1();
int x = p.add();
System.out.println(x);
OverRiding2 c = (OverRiding2)p;
c.m2();
int y = c.multiply(5, 6);
	System.out.println(y);
	}
}
