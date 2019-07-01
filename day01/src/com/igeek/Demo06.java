package com.igeek;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0
 * @description：需求：while循环实现1-100之间数据求和
 */
public class Demo06 {
	public static void main(String[] args) {
		
		int x = 1;
		int result = 0;
		while (x <=100) {
			result += x;
			x++;
		}
		
		System.out.println(result);
		System.out.println("------------------");
		
		x = 1;
		result = 0;
		do {
			result += x;
			x++;
		} while (x <= 100);
		
		System.out.println(result);
		System.out.println("------------------");
		//jdk1.5 foreach循环
		int[] array = {1,2,3,4,5};
		for (int i : array) {
			System.out.println(i);
		}
	}
}
