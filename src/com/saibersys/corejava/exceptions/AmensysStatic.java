package com.saibersys.corejava.exceptions;

public abstract class AmensysStatic {
	int id;
	String owner;
	String address;

	public AmensysStatic(int id, String owner, String address) {
		this.id = id;
		this.owner = owner;
		this.address = address;
	}
	public abstract void payroll();
}
