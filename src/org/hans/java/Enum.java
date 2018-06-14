package org.hans.java;
/**
 * 枚举enum
 */
import org.hans.java.FreshJuice.FreshJuiceSize;

public class Enum {
	public static void main(String[] args) {
		FreshJuiceSize large = FreshJuice.FreshJuiceSize.large;
		FreshJuiceSize large2=FreshJuice.FreshJuiceSize.large;
		System.out.println(large);
		System.out.println(large2);
		String s = null;
		assert s!=null?true:false;
		System.out.println("end");
	}
}
class FreshJuice{
	enum FreshJuiceSize{small,mdium,large}
	FreshJuiceSize size;
}