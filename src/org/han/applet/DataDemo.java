package org.han.applet;

import java.util.Calendar;

public class DataDemo {
	public static void main(String[] args) {
		Calendar beginCalendar = Calendar.getInstance();
		beginCalendar.set(2018,3,20,19,0,0);
		Calendar endCalendar = Calendar.getInstance();
		endCalendar.set(2018,8,16,18,0,0);	
		long beginTime = beginCalendar.getTime().getTime(); 
		long endTime = endCalendar.getTime().getTime(); 
		long betweenDays = (long)((endTime - beginTime) / (1000 * 60 * 60 *24)); 
		System.out.println(betweenDays);		
	}
}
