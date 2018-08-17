package org.hans.java;
public class MyRunnable implements Runnable{
    private volatile boolean active;
    public void run()
    {
        active = true;
        int num=0;
        while (active) // 第一行
        {
            System.out.println("哈哈哈,num="+num);
            num++;
            try {
				Thread.sleep(1000*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
    public boolean isActive(){
    	return active;
    }
    public void stop()
    {
        active = false; // 第二行
    }
    
}