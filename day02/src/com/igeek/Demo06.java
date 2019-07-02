package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：嵌套循环
 */
public class Demo06 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=5 ; i++) {
			
			for (int j = 1; j <= 5 ;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
			System.out.println("***********");
			muti();
			
		}
	}
	
	//9*9乘法表
	public static void muti() {
		
		for (int i = 1; i < 10; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(j+"*"+i+"="+(j*i)+" ");
				
			}
			System.out.println();
			
		}
		
	}
	
	
	
	
	
	

}
