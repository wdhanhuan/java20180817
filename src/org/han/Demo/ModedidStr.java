package org.han.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModedidStr {
	public static void main(String[] args) {
		String str1="5000000-15000005;";
		String str2="2-10000005;";
		String str=getReallyModedidString(str1,str2);
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1; i++) {
			getReallyModedidString(str1,str2);
		}
		long end=System.currentTimeMillis();
		System.out.println("time="+(end-start));
		System.out.println(str);
	}
	/**
	 * 判断其中是否有转换异常，并得到合并后的数据
	 * @param str
	 * @param str2 
	 * @return
	 */
	private static String getReallyModedidString(String str1, String str2) {
		if(!str1.endsWith(";")){
			str1=str1+";";
		}
		String str=str1+str2;
		try {
			String strR=getReallyModedidValue(str);
			return strR;
		} catch (Exception e) {
			e.printStackTrace();
			return str;
		}
	}
	/**
	 * 得到合并后的数据
	 * @param str1:1-10;15-17;19;
	 * @param str2:17-20;25-30;
	 * @return str:1-10;15-20;25-30;
	 */
	private static String getReallyModedidValue(String str) {
		Set<Integer> set=new HashSet<Integer>();
		String[] split = str.split(";");
		for (int i = 0; i < split.length; i++) {
			List<Integer> list=getIntegerList(split[i]);
			set.addAll(list);
		}
		String strr=getStringBySet(set);
		return strr;
	}
	/**
	 * 将set里面的数字划分出范围来
	 * @param set
	 * @return
	 */
	private static String getStringBySet(Set<Integer> set) {
		Object[] arr = set.toArray();
		//对去重后的数据从小到大排序
		Arrays.sort(arr);
		int start=(int) arr[0];
		int end=0;
		String str="";
		for (int i = 0; i < arr.length-1; i++) {
			int a = (int) arr[i];
			int b=(int) arr[i+1];
			if((b-a)!=1){
				end=a;
				if(start<end){
					str=str+start+"-"+end+";";
				}else if(start==end){
					str=str+start+";";
				}
				start=b;				
			}
		}
		if(start==(int) arr[arr.length-1]){
			str=str+start+";";
		}
		if(start<(int) arr[arr.length-1]){
			str=str+start+"-"+(int) arr[arr.length-1]+";";
		}
		return str;
	}
	/**
	 * 将字符串a-b按照数字放入到list中去
	 * @param str
	 * @return
	 */
	private static List<Integer> getIntegerList(String str) {
		List<Integer> list=new ArrayList<Integer>();
		if(!str.contains("-")){
			list.add(Integer.parseInt(str));
		}else{
			String[] split = str.split("-");
			int start=Integer.parseInt(split[0]);
			int end=Integer.parseInt(split[1]);
			for (int i = start; i < end+1; i++) {
				list.add(i);
			}
		}
		return list;
	}

}
