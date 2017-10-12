package com.saibersys.corejava.exceptions;
class dept{}
class empa{}
public class Assignmentmethodreal {

	empa m1()
	{
		System.out.println("m1 method");
		return new emp();
	}
	dept m2()
	{
		System.out.println("m2 method");
		return new dept();
	}
	public static void main(String[] args) {
		empa e = new emp();
		dept d = new dept();
		System.out.println(e);

		System.out.println(d);
	}

}
