package com.igeek;

import java.util.Random;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：需求：如何获取到一个1-100之间的伪随机数呢?
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int i = random.nextInt(100)+1;
		System.out.println(i);
		
	}

}
