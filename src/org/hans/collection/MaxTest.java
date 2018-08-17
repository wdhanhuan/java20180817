package org.hans.collection;

public class MaxTest {
	
	public static <T extends Comparable<T>> T maxinum(T x,T y,T z){
		T max = x ;
		if(y.compareTo(max)>0){
			max=y;
		}
		if(z.compareTo(max)>0){
			max=z;
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		Integer maxi= maxinum(3, 4, 5);
		Double maxd = maxinum(3.0,5.0,4.0);
		System.out.println(maxi);
		System.out.println(maxd);
		String maxs = maxinum("apple","pear","orange");
		System.out.println(maxs);
	}
}
