package org.hans.java;
/**
 * 测试volatile，有和没有测试的效果一样？
 * 没用搞明白
 * @author Administrator
 *private volatile boolean active;
 *private boolean active;
 */
public class MyRunnableMain {
	public static void main(String[] args) {
		MyRunnable m1=new MyRunnable();
		MyRunnable m2=new MyRunnable();
		new Thread(m1).start();
		System.out.println(m1.isActive());
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.stop();
		System.out.println("m1:"+m1.isActive());
		System.out.println("m2:"+m2.isActive());
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m1.stop();
		System.out.println("1m1:"+m1.isActive());
		System.out.println("1m2:"+m2.isActive());
	}
}
