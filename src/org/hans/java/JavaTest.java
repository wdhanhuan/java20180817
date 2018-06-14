package org.hans.java;

public class JavaTest {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {  
            int n = i + 1;  
            String s = n + "%";  
            System.out.print(n + "%");  
  
            if (i == 19) {  
                break;  
            } 
  
            for (int j = 0; j < s.length(); j++) {  
                System.out.print('\b');  
            }  
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};  
        }  
  
		
	}

}
