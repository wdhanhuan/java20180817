package org.han.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("hanhuan");
		e.setAddress("北京");
		e.setSsn(111222333);
		e.setNum(101);
		try {
			FileOutputStream fo = new FileOutputStream("/emp.txt");
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(e);
			out.close();
			fo.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
