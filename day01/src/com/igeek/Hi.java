package com.igeek;

import java.io.File;

/**
 * 
 * @author zx
 * @date 2019年7月1日
 * @version 1.0 @description：
 * 
 *          ctrl + shift + x;y
 */
public class Hi {

	public static final double PI = 3.14;

	public static void main(String[] args) {
		// 直接输出了运算的结果
//		System.out.println(3 + 4);

		System.out.println();
		// 定义两个int类型的变量
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);

		String helloWorld;

		// 定义一个byte类型,定义一个int类型
		byte bb = 2;
		int cc = 5;
		// 强转
		byte dd = (byte) (bb + cc);
		System.out.println(dd);

		char ee = 'a';
		int ff = ee;
		System.out.println(ff);

		// 我能不能不直接输出，用一个变量接受呢?
		// 用变量接受，这个变量应该有类型
		// 可能损失精度
		// byte dd = bb + cc;
//		int dd = bb + cc;
//		System.out.println(dd);
	}

}
