package com.singleton;

public class SingletonCheckClone {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton obj1=Singleton.getSingletonObject();
		Singleton obj2=(Singleton)obj1.clone();
		System.out.println("object1>>"+obj1.hashCode());

		System.out.println("object1>>"+obj2.hashCode());
		
	}

}
