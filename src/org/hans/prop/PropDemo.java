package org.hans.prop;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropDemo {
	public static void main(String[] args) {
		Properties prop=new Properties();
		try {
			// FileInputStream 这个类读取的相对路径针对的是项目根目录,本项目的根木录是/Users/Administrator/workspaceforhadoop/Java
			//InputStream in=new BufferedInputStream(new FileInputStream("/Users/Administrator/workspaceforhadoop/Java/src/org/hans/prop/prop.properties"));
			InputStream in=new BufferedInputStream(new FileInputStream("./src/org/hans/prop/prop.properties"));
			//InputStream in=new BufferedInputStream(new FileInputStream("./bin/org/hans/prop/prop.properties"));
			//InputStream in=new BufferedInputStream(new FileInputStream("../Java/bin/org/hans/prop/prop.properties"));
			//prop.load(PropDemo.class.getResourceAsStream("prop.properties"));
			String name=prop.getProperty("name");
			String age=prop.getProperty("age");
			String address=prop.getProperty("address");
			int parseInt = Integer.parseInt(age);
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
