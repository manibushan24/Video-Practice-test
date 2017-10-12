package com.saibersys.corejava.exceptions;

public class ConstExample {

	ConstExample()
	{
		System.out.println("No arguments");
	}
	ConstExample(int a)
	{
		System.out.println("One Argument");
	}
	
	public static void main(String[] args) {
 ConstExample obj = new ConstExample();
 ConstExample obj1 = new ConstExample(10);


	}

}
