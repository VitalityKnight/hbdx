package com.igeek;

public class Test001 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// 字符参与加法操作
		char c = '0';
		char c2 = 'a';
		System.out.println((int) c);
		System.out.println((int) c2);
		System.out.println("------------------");
		System.out.println(a + c);
		System.out.println(a + c2);
		System.out.println("------------------");

		// 字符串参与加法操作
		System.out.println("hello" + a);
		System.out.println("hello" + a + b); // "hello"+10,然后再和b进行拼接
		System.out.println(a + b + "hello");

	}
}
