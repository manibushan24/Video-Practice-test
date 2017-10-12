package com.saibersys.corejava.exceptions;

class Parent {
	
	void m1()
	{
		System.out.println("parent method");
		
	}
}
	public class Child extends Parent
	{
		void m1()
		{
			System.out.println("child method");
		}
	
void m2()
{
	System.out.println("child 2 method");}
	public static void main(String[] args) {
	Parent p = new Child();
	p.m1();
	Child c = (Child)p;
	c.m2();

	}
	}

