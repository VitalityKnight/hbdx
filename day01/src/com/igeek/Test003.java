package com.igeek;

public class Test003 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-----------------");
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("-----------------");
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("-----------------");
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-----------------");

		int x = 3;
		int y = 4;
		// System.out.println(x == y);
		// System.out.println(x = y);// 把y赋值给x，把x的值输出
		boolean bb = (x == y);
		// 报错
		// boolean cc = (x = y);
		int cc = (x = y);

	}

}
