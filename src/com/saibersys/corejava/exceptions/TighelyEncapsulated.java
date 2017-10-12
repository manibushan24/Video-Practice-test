package com.saibersys.corejava.exceptions;

import org.omg.Messaging.SyncScopeHelper;

public class TighelyEncapsulated {
	private int eid;
	private String ename;
	private float e;
		
public void seteid(int eid)
{this.eid=eid;
	}
public void setename(String ename)
{
	this.ename=ename;}
public void setfloat(float e)
{this.e=e;
	}
public int geteid(){

return eid;
}
public String getename()
{return ename;
	}
public float getfloat()
{
	return e;}

	public static void main(String[] args) {
	TighelyEncapsulated obj=new TighelyEncapsulated();
		obj.seteid(100);
		obj.setename("mani");
		obj.setfloat(10.5f);
		
System.out.println(obj.geteid());
System.out.println(obj.getename());
System.out.println(obj.getfloat());
	}

}
