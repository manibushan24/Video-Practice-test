package com.saibersys.corejava.exceptions;

public abstract class Sai implements PrimaryCons{

	@Override
	public void training() {
System.out.println("trainig is done for 3 months");		
	}

	@Override
	public void marketing() {
System.out.println("marketing will do for 3 months");		
	}

	@Override
	public abstract void payroll();

}
