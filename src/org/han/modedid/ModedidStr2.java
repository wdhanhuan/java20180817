package org.han.modedid;
/**
 * 对于区间段的插入的效率很低，一个一个的插入的时间长,尤其是数据量很大的时候体现明显
 * @author Administrator
 *
 */
public class ModedidStr2 {
	public static void main(String[] args) {
		String str1="1-1005;";
		String str2="2-2005;";
		/**
		 * 可以判断一下数据量的多少，然后决定谁插入谁
		 */
		String str=getString(str1,str2);
		long start=System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			getString(str1,str2);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(str);
	}
	/**
	 * 获取长度决定选择哪个
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static String getString(String str1, String str2) {
		int lengthStr1=getNumLengthOfString(str1);
		int lengthStr2=getNumLengthOfString(str2);
		if(lengthStr1>lengthStr2){
			return getReallyString(str1,str2);
		}else{
			return getReallyString(str2, str1);
		}
	}
	/**
	 * 获取字符串的里面的数字的长度
	 * @param str
	 * @return
	 */
	private static int getNumLengthOfString(String str) {
		int length=0;
		String[] split = str.split(";");
		for (int i = 0; i < split.length; i++) {
			if(split[i].contains("-")){
				String[] split2 = split[i].split("-");
				int start=Integer.parseInt(split2[0]);
				int end=Integer.parseInt(split2[1]);
				length=length+end-start+1;
			}else{
				length++;
			}
		}
		return length;
	}
	/**
	 * @param str1 "17-100;203;300-500;606;"
	 * @param str2 "2-10;12-50;80-150;"
	 * @return
	 */
	private static String getReallyString(String str1, String str2) {
		String[] split = str2.split(";");
		for (int i = 0; i < split.length; i++) {
			str1=insertToGetReallyString(str1,split[i]);
		}
		return str1;
	}
	/**
	 * @param str1 "17-100;203;300-500;606;"
	 * @param string "10"
	 * @return
	 */
	private static String insertToGetReallyString(String str1, String string) {
		String str="";
		String[] split = str1.split(";");
		if(string.contains("-")){//string是一段2-10
			/**
			 * 对于区间段的插入的效率很低，一个一个的插入的时间长
			 */
			str=str1;
			String[] split2 = string.split("-");
			int start=Integer.parseInt(split2[0]);
			int end=Integer.parseInt(split2[1]);
			for (int i = start; i < end+1; i++) {
				str=insertToGetReallyString(str, Integer.toString(i));
			}
		}else{//string只是一个数字
			boolean flag=false;
			for (int i = 0; i < split.length; i++) {
				flag=stringIsInStr1(split[i],string);
				if(flag==true){
					return str1;
				}
			}
			str=OneStringToStr(str1,string);
			//对得到的字符串进行融合
			flag=oneToStr(str,string);
			//该数字是否可以融合？可以融合的话，融合进来
			if(flag){
				str=trueToOne(str);
			}
		}
		
		return str;
	}
	/**
	 * 对字符串融合
	 * @param str="17-100;202;203;300-500;606;"
	 * @return
	 */
	private static String trueToOne(String str) {
		String s="";
		String[] split = str.split(";");
		int j=-1;
		for (int i = 0; i < split.length-1; i++) {
			String a=split[i];
			String b=split[i+1];
			int end;
			int start;
			if(a.contains("-")){
				end=Integer.parseInt(a.split("-")[1]);
			}else{
				end=Integer.parseInt(a);
			}
			if(b.contains("-")){
				start=Integer.parseInt(b.split("-")[0]);
			}else{
				start=Integer.parseInt(b);
			}
			if((start-end)==1){
				j=i;
				break;
			}
		}
		for (int i = 0; i < split.length; i++) {
			if(j==i){
				if(split[i+1].contains("-")){
					if(split[i].contains("-")){
						s=s+split[i].split("-")[0]+"-"+split[i+1].split("-")[1]+";";
					}else{
						s=s+split[i]+"-"+split[i+1].split("-")[1]+";";
					}
				}else{
					if(split[i].contains("-")){
						s=s+split[i].split("-")[0]+"-"+split[i+1]+";";
					}else{
						s=s+split[i]+"-"+split[i+1]+";";
					}
				}
				i++;
			}else{
				s=s+split[i]+";";
			}
		}
		boolean flag=true;
		while(flag){
			flag=selfToOne(s);
			if(flag){
				s=trueToOne(s);
			}
		}
		return s;
	}
	/**
	 * 判断自己是否可以融合
	 * @param s
	 * @return
	 */
	private static boolean selfToOne(String s) {
		String[] split = s.split(";");
		for (int i = 0; i < split.length-1; i++) {
			String a=split[i];
			String b=split[i+1];
			int end;
			int start;
			if(a.contains("-")){
				end=Integer.parseInt(a.split("-")[1]);
			}else{
				end=Integer.parseInt(a);
			}
			if(b.contains("-")){
				start=Integer.parseInt(b.split("-")[0]);
			}else{
				start=Integer.parseInt(b);
			}
			if((start-end)==1){
				return true;
			}
		}
		return false;
	}
	/**
	 * 判断str2是否可以融合进str1
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static boolean oneToStr(String str1, String str2) {
		String[] split = str1.split(";");
		for (int i = 0; i < split.length; i++) {
			if(split[i].contains("-")){
				int start=Integer.parseInt(split[i].split("-")[0]);
				int end=Integer.parseInt(split[i].split("-")[1]);
				int num=Integer.parseInt(str2);
				int a=start-num;
				int b=num-end;
				if(a==1 || b==1){
					return true;
				}
			}else{
				int start=Integer.parseInt(split[i]);
				int num=Integer.parseInt(str2);
				int a=start-num;
				int b=num-start;
				if(a==1 || b==1){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 将str2插入到str1里面去
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static String OneStringToStr(String str1, String str2) {
		String[] split = str1.split(";");
		if(split[0].contains("-")){
			if(Integer.parseInt(str2)<Integer.parseInt(split[0].split("-")[0])){
				return str2+";"+str1;
			}
		}else{
			if(Integer.parseInt(str2)<Integer.parseInt(split[0])){
				return str2+";"+str1;
			}
		}
		if(split[split.length-1].contains("-")){
			if(Integer.parseInt(str2)>Integer.parseInt(split[split.length-1].split("-")[1])){
				return str1+str2+";";
			}
		}else{
			if(Integer.parseInt(str2)>Integer.parseInt(split[split.length-1])){
				return str1+str2+";";
			}
		}
		String str="";
		int j=-1;
		/**
		 * 这里区间错误，导致错误
		 */
		for (int i = 1; i < split.length; i++) {
			if(split[i].contains("-")){
				int start=Integer.parseInt(split[i].split("-")[0]);
				int num=Integer.parseInt(str2);
				if(num<start){
					j=i;
					break;
				}
			}else{
				int start=Integer.parseInt(split[i]);
				int num=Integer.parseInt(str2);
				if(num<start){
					j=i;
					break;
				}
			}
		}
		for (int i = 0; i < split.length; i++) {
			if(i==j){
				str=str+str2+";"+split[i]+";";
			}else{
				str=str+split[i]+";";
			}
		}
		
		return str;
	}
	/**
	 * str2是否属于st1
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static boolean stringIsInStr1(String str1, String str2) {
		if(str1.contains("-")){
			String[] split = str1.split("-");
			int start=Integer.parseInt(split[0]);
			int end=Integer.parseInt(split[1]);
			int num=Integer.parseInt(str2);
			if(start<=num && end>=num){
				return true;
			}
		}else{
			if(str1.equals(str2)){
				return true;
			}
		}
		return false;
	}
}
