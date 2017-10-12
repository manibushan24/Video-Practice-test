package com.saibersys.corejava.exceptions;

public class StatExample {
	{
		System.out.println("hi");
	}
	{
		System.out.println("hello");
		
	}
	static
	{
		System.out.println("hi1");
		
	}
	static 
	{
		System.out.println("hello1");
	}
	{
		System.out.println("instance block");
	}
StatExample()
{System.out.println("const1");

	}
//StatExample(int a)
//{
	//System.out.println("const2");
	//}
public static void main(String[] args) {
	new StatExample();
	//new StatExample(10);

	}

}
