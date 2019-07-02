package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：
 * 需求：打印5位数中的所有回文数。
 * 		什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Demo17 {
	
	public static void main(String[] args) {
		int count =0;
		for (int i = 10000; i < 100000; i++) {
			
			int ge = i%10;
			int shi = i/10%10;
			int qian = i/1000%10;
			int wan = i/10000;
			
			if((ge == wan) && (shi == qian)) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("count:"+count);
	}

}
