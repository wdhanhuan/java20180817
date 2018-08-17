package org.han.Demo;

public class Diamond {
	public static void main(String[] args) {
		print(5);
		doTowers(5, 'A', 'B', 'C');
	}

	private static void print(int size) {
		if(size%2==0){
			size++;
		}
		for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
	}
	public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1){
            System.out.println("Disk 1 from "
            + from + " to " + to);
        }else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Diskelse "
            + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
