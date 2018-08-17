package org.hans.java;

import java.util.HashMap;
import java.util.Map;

public class JavaTest {

	public static void main(String[] args) throws Exception {
		
		/*while(true){
			System.out.println(System.in.read());
		}*/
		/*String str="0-998";
		int livePlatForm=99;
		Map<Integer,String> map=new HashMap<Integer,String>();
		String[] split = str.split("-");
		int start=Integer.parseInt(split[0]);
		int end=Integer.parseInt(split[1]);
		int length=end-start+1;
		int a=length/livePlatForm;
		int b=length%livePlatForm;
		if(a==0){//一共只有b个，不够livePlatForm分的，前面b个每个分一个，剩下的不分
			for (int i = 1; i < b+1; i++) {
				map.put(i,start+"");
				start=start+1;
			}
			for (int i = b+1; i < livePlatForm+1; i++) {
				map.put(i, "");
			}
		}else if(a==1){//每个够分一个，多余的给最后一个
			for (int i = 1; i < livePlatForm; i++) {
				map.put(i,start+"");
				start=start+1;
			}
			map.put(livePlatForm, start+"-"+end);
		}else{//每个够分a个，多余的给最后一个,余数越小越好，最好够整除
			for (int i = 1; i < livePlatForm; i++) {
				map.put(i,start+"-"+(start+a-1));
				start=start+a;
			}
			map.put(livePlatForm, start+"-"+end);
		}
		System.out.println(map);*/
		/*for (int i = 0; i < 20; i++) {  
            int n = i + 1;  
            String s = n + "%";  
            System.out.print(n + "%");  
  
            if (i%2==0) {  
               continue;  
            } 
            for (int j = 0; j < s.length(); j++) {  
                System.out.print('\b');  
            }  
            try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};  
        } */ 
  
		
	}

}
