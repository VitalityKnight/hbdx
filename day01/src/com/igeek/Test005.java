package com.igeek;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0
 * @description：
 * 三元运算符  (关系表达式)?表达式1 ：表达式2；
 */
public class Test005 {
	
	
	public static void main(String[] args) {
		
		//获取两个数中大数
		int a = 10;
		int b = 20;
		
		int c = (a>b) ? a:b;
		System.out.println(c);
		
		boolean d = (a==b) ? true:false;
		System.out.println(d);
		
		//比较三个数中的最大值
		int e = 30;
		int temp = (a>b) ? a:b;
		int max = (temp >e) ? temp:e;
		System.out.println(max);
		
		
		
		
		
		
	}

}
