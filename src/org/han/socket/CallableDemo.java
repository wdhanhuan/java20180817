package org.han.socket;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int i=0;
		for (;i<100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		return i;
	}
	public static void main(String[] args) {
		CallableDemo cd=new CallableDemo();
		FutureTask<Integer> ft = new FutureTask<>(cd);
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
			if(i%20==5){
				new Thread(ft,"Tread-child:"+i).start();
			}
			//不能这样测试，阻塞在这里了
			/*try {
				System.out.println("子线程中途的返回值："+ft.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}*/
		}
		try {
			System.out.println("子线程的返回值："+ft.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
