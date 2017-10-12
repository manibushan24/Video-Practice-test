package com.saibersys.corejava.exceptions;


class SupConst{
	
	SupConst()
	{
		System.out.println("parent1");
	}
}

public class SupeConst extends SupConst
{
	
/*	SupeConst()
	{
	System.out.println("first const");	
	}
	SupeConst(int a)
	{this();
		System.out.println("second const");
	}
*/
	public static void main(String[] args) {
	new SupeConst();
	}

}
