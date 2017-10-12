package com.saibersys.corejava.exceptions;
class emp{}
class dept{}
class bonus{}
class salgrade {}
public class Assignmentmethods {

	void m1(emp e, dept d)
	{
		System.out.println("m1 method");
	}
	static void m2(bonus b, salgrade s)
	{
		System.out.println(" m2 method");
	}
	public static void main(String[] args) {

Assignmentmethods obj = new Assignmentmethods();
obj.m1(new emp(),new dept());
Assignmentmethods.m2(new bonus(),new salgrade());

	}

}
