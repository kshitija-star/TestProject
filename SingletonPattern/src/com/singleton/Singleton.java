package com.singleton;

import java.io.Serializable;

public class Singleton implements Cloneable,Serializable {
	
	private static Singleton  singleton;
	
	private Singleton(){
		
		
	}
	public static Singleton getSingletonObject()
	{
		synchronized(Singleton.class) {
		if(singleton==null) {
			singleton=new Singleton();
		}
		else {
			return singleton;
		}
	}
		return singleton;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	protected Object readResolve() {
		return singleton;
		
		
	}
	
	
	
	
}
