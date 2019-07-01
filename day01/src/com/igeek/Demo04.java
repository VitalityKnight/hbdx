package com.igeek;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0
 * @description：for循环
 * 
   * 需求：求出1-100之间偶数和
 */
public class Demo04 {
	
	public static void main(String[] args) {
		
		int result = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				result += i;
			}
		}
		
		System.out.println(result);
	}

}
