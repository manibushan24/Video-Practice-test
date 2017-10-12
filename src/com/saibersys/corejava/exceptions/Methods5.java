package com.saibersys.corejava.exceptions;
class Student{}
public class Methods5 {
	
	Student s1()
	{
		System.out.println("s1 method");
		Student s = new Student();
		return s;
	}
static String s2()
{
	System.out.println("s2 method");
return "mani";	}

int m1()
{System.out.println("m1 method");
return 10;
	}

	public static void main(String[] args) {
		Methods5 obj = new Methods5();
		Student s= obj.s1();
			String str = Methods5.s2();
		int x = obj.m1();
		
		
		

	}

}
