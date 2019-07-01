package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0
 * @description：键盘录入
 */
public class Test006 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//接受数据
		System.out.println("请输入第一个数据：");
		int a  = scanner.nextInt();
		System.out.println("请输入第一个数据：");
		int b  = scanner.nextInt();
		
		//比较两个数大小
		boolean flag = (a==b);
		System.out.println(flag);
		
		
		
	}

}
