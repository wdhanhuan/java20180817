package org.han.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e= null;
		try {
			FileInputStream fi = new FileInputStream("/emp.txt");
			ObjectInputStream in = new ObjectInputStream(fi);
			e=(Employee) in.readObject();
			in.close();
			fi.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("name:"+e.getName());
		System.out.println("add:"+e.getAddress());
		System.out.println("ssn:"+e.getSsn());
		System.out.println("num:"+e.getNum());
	}
}
