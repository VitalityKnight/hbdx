package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：方法的重载
 */
public class Demo11 {
	
	public static void main(String[] args) {
		System.out.println(sum(12.4F,13.8f));
	}
	
	public static float sum(float a,float b) {
		return a + b;
	}
	
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}



}
