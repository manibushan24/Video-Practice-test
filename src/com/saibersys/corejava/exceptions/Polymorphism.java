package com.saibersys.corejava.exceptions;

public class Polymorphism {
public int add(int a, int b)
{System.out.println(a+b);
return a+b;
	}
	public static void main(String[] args) {
		Polymorphism x = new Polymorphism();
		int y = x.add(10, 20);
		System.out.println(y);
		

	}

}
