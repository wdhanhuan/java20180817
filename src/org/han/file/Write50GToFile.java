package org.han.file;

import java.io.File;
import java.io.FileOutputStream;

public class Write50GToFile {

	public static void main(String[] args) throws Exception {
		int num=50;//50G
		Long start=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer();
		File file=new File("D:\\a.txt");
		FileOutputStream out = new FileOutputStream(file,false);
		for (int i = 0; i < 1024*1024*10; i++) {
			//100M
			sb.append("abcdefgabc");
		}
		for (int i = 0; i <10*num; i++) {
			if(i%10==0){
				long time=(System.currentTimeMillis()-start)/1000;
				System.out.println("写入到文件: "+(i/10)+" G文件的耗时是: "+time+" s");
			}
			out.write(sb.toString().getBytes());
			
		}
		System.out.println("50 G文件总耗时是: "+((System.currentTimeMillis()-start)/1000)+" s");
		out.close();
		System.out.println("It's over!!!");

	}

}
