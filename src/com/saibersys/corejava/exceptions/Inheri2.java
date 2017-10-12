package com.saibersys.corejava.exceptions;
class Inheri1{
	int x=20, y=100;
}
class Inheri2 extends Inheri1
{

	int x=50, y=100;
	void m1(int x, int y)
	{
	System.out.println(x+y);
	System.out.println(super.x+super.y);
	System.out.println(this.x+this.y);

	}
	
	public static void main(String[] args) {
	new Inheri2().m1(10, 20);
	}

}
