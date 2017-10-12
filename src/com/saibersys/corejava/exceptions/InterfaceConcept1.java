package com.saibersys.corejava.exceptions;

public class InterfaceConcept1 implements InterConcept1 {
public void method1()
{
	System.out.println("method1");
	}
public void method2()
{
	System.out.println("method2");
	
}
public void method3()
{
	System.out.println("method3");
	}

	public static void main(String[] args) {
new InterfaceConcept1().method1();
new InterfaceConcept1().method2();
new InterfaceConcept1().method3();
	}

}
