package org.hans.java;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("a", "a");
		System.out.println(map== null || (map != null && !map.containsKey("a")));
	}
}
