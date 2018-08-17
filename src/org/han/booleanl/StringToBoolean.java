package org.han.booleanl;

public class StringToBoolean {

	public static void main(String[] args) {
		boolean parseBoolean = Boolean.parseBoolean("TRUE");
		System.out.println(parseBoolean);
		if(parseBoolean){
			System.out.println(true);
		}
	}

}
