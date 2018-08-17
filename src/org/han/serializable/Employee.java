package org.han.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private String address;
	private transient int ssn;
	private int num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void mailCheck(){
		System.out.println("Mailing a check to"+name+":"+address);
	}
}
