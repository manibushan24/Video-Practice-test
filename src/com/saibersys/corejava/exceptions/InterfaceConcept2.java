package com.saibersys.corejava.exceptions;

public class InterfaceConcept2 extends InterfaceConcept1{
	public void method2()
	{
		System.out.println("method2");
		
	}
	public void method3()
	{
		System.out.println("method3");
	}
	public static void main(String[] args) {
		new InterfaceConcept2().method1();
		new InterfaceConcept2().method2();
		new InterfaceConcept2().method3();

	}

}
