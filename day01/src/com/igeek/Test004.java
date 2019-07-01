package com.igeek;

public class Test004 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println((a > b) & (a > c));// false & false
		System.out.println((a < b) & (a > c)); // true & false
		System.out.println((a > b) & (a < c)); // false & true
		System.out.println((a < b) & (a < c)); // true & true
		System.out.println("---------------");
		System.out.println((a > b) | (a > c));// false | false
		System.out.println((a < b) | (a > c)); // true | false
		System.out.println((a > b) | (a < c)); // false | true
		System.out.println((a < b) | (a < c)); // true | true
		System.out.println("---------------");
		System.out.println((a > b) ^ (a > c));// false ^ false
		System.out.println((a < b) ^ (a > c)); // true ^ false
		System.out.println((a > b) ^ (a < c)); // false ^ true
		System.out.println((a < b) ^ (a < c)); // true ^ true
		System.out.println("---------------");
		System.out.println((a > b)); // false
		System.out.println(!(a > b)); // !false
		System.out.println(!!(a > b)); // !!false

	}
}
