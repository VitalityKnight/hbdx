package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0
 * @description：Alt+/:内容提示
 * 
   * 需求：
 * 	根据键盘录入的数值1，2，3，…7输出对应的星期一，星期二，星期三…星期日。

 */
public class Demo03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字（1-7）：");
		int week = scanner.nextInt();
		
		switch (week) {
		case 1:
			System.out.println("星期1");
			break;
		case 2:
			System.out.println("星期2");
			break;
		case 3:
			System.out.println("星期3");
			break;
		case 4:
			System.out.println("星期4");
			break;
		case 5:
			System.out.println("星期5");
			break;
		case 6:
			System.out.println("星期6");
			break;
		case 7:
			System.out.println("星期7");
			break;

		default:
			System.out.println("输入数据有误");
			break;
		}
		
	}

}
