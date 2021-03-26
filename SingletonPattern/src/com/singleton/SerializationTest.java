package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest  implements Serializable{

	private static final long serialVersionUID = 1L;

	
	public static void main(String[] args) {
		try {
			Singleton instance1=Singleton.getSingletonObject();
			ObjectOutput out=new ObjectOutputStream(new FileOutputStream("D:\\single.txt"));
			out.writeObject(instance1);
			out.close();
			
			Singleton instance2=Singleton.getSingletonObject();
			ObjectInput in=new ObjectInputStream(new FileInputStream("D:\\single.txt"));
			in.readObject();
			in.close();
			
			System.out.println("instance 1>>"+instance1.hashCode());
			System.out.println("instance 2>>"+instance2.hashCode());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
