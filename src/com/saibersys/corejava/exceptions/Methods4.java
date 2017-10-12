package com.saibersys.corejava.exceptions;

public class Methods4 {
    
	int c=10, d=5;
	void m1(int c,int d)
	{
		System.out.println(c+d);
		System.out.println(this.c+ this.d);
	}
	public static void main(String[] args) {

		Methods4 obj = new Methods4();
         obj.m1(20,10);
	}

}
