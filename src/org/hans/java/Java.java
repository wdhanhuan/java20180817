package org.hans.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collectors;

public class Java {

	public static void main(String[] args) throws Exception{
		double a=3.47;
		for (int i = 0; i <Integer.MAX_VALUE; i++) {
			a=a*0.9;
			System.out.println("a="+a);
			if(a<2.00){
				System.out.println(i);
				break;
			}
		}
		
		/* // 使用基本编码
        String base64encodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
        System.out.println("Base64 比那么字符串 (基本) :" + base64encodedString);
       
        // 解码
        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
       
        System.out.println("原始字符串: " + new String(base64decodedBytes, "utf-8"));
        base64encodedString = Base64.getUrlEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
        System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);
       
        StringBuilder stringBuilder = new StringBuilder();
       
        for (int i = 0; i < 10; ++i) {
           stringBuilder.append(UUID.randomUUID().toString());
        }
       
        byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);
        */
		/*List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> string.contains("a")).collect(Collectors.toList());
		System.out.println(strings);
		System.out.println(filtered);
		Random random = new Random();
		random.ints().limit(3).forEach(System.out::println);*/
		/*char A='A';
		char a='a';
		int AA=A;
		int aa=a;
		System.out.println(AA);
		System.out.println(aa);
		*/
		/* int a[] = new int[2];
		 try{
		       System.out.println("Access element three :" + a[3]);
		    }catch(ArrayIndexOutOfBoundsException e){
		       System.out.println("Exception thrown  :" + e);
		       e.printStackTrace();
		    }
		    finally{
		       a[0] = 6;
		       System.out.println("First element value: " +a[0]);
		       System.out.println("The finally statement is executed");
		    }
		*/
		/* try{
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[1]);
	         throw new NullPointerException();
	      }catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Exception thrown  :" + e);
	         System.err.println(e.getMessage());
	         System.err.println(e.getLocalizedMessage());
	         System.err.println(e.getCause());
	      }
	      System.out.println("Out of the block");*/
		
		/*Scanner scan = new Scanner(System.in);
		 
        double sum = 0;
        int m = 0;
 
        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
 
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();*/
		
		/*Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
 
        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();*/
		
		/*String dirname = "/Windows_RRR";
	    File f1 = new File(dirname);
	    if (f1.isDirectory()) {
	      System.out.println( "目录 " + dirname);
	      String s[] = f1.list();
	      for (int i=0; i < s.length; i++) {
	        File f = new File(dirname + "/" + s[i]);
	        if (f.isDirectory()) {
	          System.out.println(s[i] + " 是一个目录");
	        } else {
	          System.out.println(s[i] + " 是一个文件");
	        }
	      }
	    } else {
	      System.out.println(dirname + " 不是一个目录");
	    }*/
		
		/*File f = new File("a.txt");
	    FileOutputStream fop = new FileOutputStream(f);
	    // 构建FileOutputStream对象,文件不存在会自动新建
	    
	    OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
	    // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
	    
	    writer.append("中文输入");
	    // 写入到缓冲区
	    
	    writer.append("\r\n");
	    //换行
	    
	    writer.append("English");
	    // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
	    
	    writer.close();
	    //关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
	    
	    fop.close();
	    // 关闭输出流,释放系统资源
	 
	    FileInputStream fip = new FileInputStream(f);
	    // 构建FileInputStream对象
	    
	    InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
	    // 构建InputStreamReader对象,编码与写入相同
	 
	    StringBuffer sb = new StringBuffer();
	    while (reader.ready()) {
	      sb.append((char) reader.read());
	      // 转成char加到StringBuffer对象中
	    }
	    System.out.println(sb.toString());
	    reader.close();
	    // 关闭读取流
	    
	    fip.close();
	    // 关闭输入流,释放系统资源
*/	 		
		/*// 使用 System.in 创建 BufferedReader 
	    BufferedReader br = new BufferedReader(new
	                            InputStreamReader(System.in));
	    String str;
	    System.out.println("Enter lines of text.");
	    System.out.println("Enter 'end' to quit.");
	    do {
	       str = br.readLine();
	       System.out.println(str);
	    } while(!str.equals("end"));*/
		/*char c = 0;
	    // 使用 System.in 创建 BufferedReader 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("输入字符, 按下 'q' 键退出。");
	    // 读取字符
	    do {
	       try {
	    	   c = (char) br.read();
	       } catch (IOException e) {
	    	   e.printStackTrace();
	       }
	       System.out.println(c);
	    } while(c != 'q');*/
		// 调用可变参数的方法
        /*printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
        double[] d={1,3,41,5,6};
        printMax(d);
        printMax();*/
		//System.out.println("\\\n\\");
		/*// 按指定模式在字符串查找
	    String line = "This order was placed for QT3000! OK?";
	    String pattern = "(\\D*)(\\d+)(.*)";
	 
	    // 创建 Pattern 对象
	    Pattern r = Pattern.compile(pattern);
	 
	    // 现在创建 matcher 对象
	   Matcher m = r.matcher(line);
	   if (m.find( )) {
	       System.out.println("Found value: " + m.group(0) );
	       System.out.println("Found value: " + m.group(1) );
	       System.out.println("Found value: " + m.group(2) );
	       System.out.println("Found value: " + m.group(3) ); 
	    } else {
	       System.out.println("NO MATCH");
	    }*/
		/*String content = "I am noob from runoob.com.";
		String pattern = ".*runooba.*";
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含了 'runooba' 子字符串? " + isMatch);*/
		//System.out.println(new Date(1999,5,3));
		/*String a="zbbbbbb";
		int compareTo = "zazzzzz".compareTo("z1azzzzz");
		System.out.println(compareTo);*/
		/*System.out.println("hello world!");
		System.out.println("hahah");
		Thread t=new Thread();
		System.out.println(t.getId());
		System.out.println(t.getName());
		Thread t1=new Thread("alal");
		System.out.println(t1.getId());
		System.out.println(t1.getName());*/
		/*char a='1';
		int c=a;
		Character b='a';
		System.out.println("a:"+a);
		System.out.println("c:"+c);
		System.out.println("b:"+b.charValue());
		System.out.println("b2:"+b.toUpperCase('c'));
		System.out.println("b3:"+b);*/
		/*int aa=100;
		System.out.println(aa>>4);*/
	}
	public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
 
        double result = numbers[0];
 
        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
	//删除文件及目录
	public static void deleteFolder(File folder) {
	   File[] files = folder.listFiles();
	   if(files!=null) { 
	       for(File f: files) {
	           if(f.isDirectory()) {
	        	   //自己调用自己递归删除，慎用，小心自己的电脑
	               deleteFolder(f);
	            } else {
	                f.delete();
	            }
	       }
	   }
	   folder.delete();
	 }
}
