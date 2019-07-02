package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：
 * 方法的参数是基本类型的时候：
  		形式参数的改变不影响实际参数。
  	形式参数：用于接收实际数据的变量
  	实际参数：实际参与运算的变量

 */
public class Demo13 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("1a:"+a+";"+"b:"+b);
		change(a, b);
		System.out.println("2a:"+a+";"+"b:"+b);

	}
	
	public static void change(int a, int b) {
		System.out.println("3a:"+a+";"+"b:"+b);
		a = b;
		b = a+b;
		System.out.println("4a:"+a+";"+"b:"+b);
	}

}
