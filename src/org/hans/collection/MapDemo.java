package org.hans.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
;
public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("name","hanhuan");
		map.put("age","20");
		map.put("addr","北京");
		System.out.println("keySet:");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key="+key+",value="+map.get(key));
		}
		System.out.println("iterator:");
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		System.out.println("推荐：");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+",value="+entry.getKey());
		}
		System.out.println("map.values:");
		for(String v : map.values()){
			System.out.println("value="+v);
		}
	}
}
