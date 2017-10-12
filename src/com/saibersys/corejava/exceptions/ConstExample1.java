package com.saibersys.corejava.exceptions;

public class ConstExample1 {
	int a;
	String emp;
	float f;
	ConstExample1(int a, String emp, float f)
	{
		
		System.out.println(a);
	System.out.println(emp);
	System.out.println(f);
	this.a=a;
	this.emp=emp;
	this.f=f;
		
	}
	void Const(){
	
		System.out.println(a);
		System.out.println(emp);
		System.out.println(f);
	}
	public static void main(String[] args) {
		ConstExample1 obj= new ConstExample1(10, "abc", 10.5f);
		obj.Const();		
	}

}
