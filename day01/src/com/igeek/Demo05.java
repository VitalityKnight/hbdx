package com.igeek;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0
 * @description：需求：统计”水仙花数”共有多少个
   *                      定义:153 = 1*1*1 + 5*5*5 + 3*3*3
   *       个位：     %10
   *      十位：     %100/10
   *      百位：    /100
   *                      
 */
public class Demo05 {
	
	public static void main(String[] args) {
		
		int count=0;
		
		for(int i = 100;i<1000;i++) {
			
			int ge = i%10;
			int shi = i%100/10;
			int bai = i/100;
			
			if(i == (ge*ge*ge + shi*shi*shi+bai*bai*bai) ) {
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println("水仙花数："+count);
		
	}

}
