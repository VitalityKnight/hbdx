package com.igeek;

import com.util.PrintArray;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：需求：键盘录入两个数据，返回两个数中的较大值
 */
public class Demo10 {
	
	public static void main(String[] args) {
		int max = getMax(10, 58);
		System.out.println(max);
		System.out.println("*********");
		System.out.println(compare(10, 90));
		System.out.println("*********");
		System.out.println(getMax(3, 5, 6));
		System.out.println("*********");
		int[] arr = {1,32,3,4,5};
		PrintArray.printNumber(arr);
	}
	
	public static int getMax(int a,int b) {
		int max=0;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	public static boolean compare(int a,int b) {
		return a==b;
	}
	
	public static int getMax(int a,int b,int c) {
		int max = a;
		if(max <b) {
			max = b;
		}
		if(max <c) {
			max = c;
		}
		return max;
	}

}
