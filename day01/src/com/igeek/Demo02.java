package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0
 * @description：
 * 
 * 键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
 * 90-100	优秀
 * 80-90	好
 * 70-80	良
 * 60-70	及格
 * 60以下	不及格
 * 
 * 分析：
 * 		A:键盘录入学生考试成绩
 * 			三步骤
 * 		B:通过简单的分析，我们决定采用if语句格式3来实现
 * 
 * 程序一定要考虑周全了。
 * 		安全数据
 * 		边界数据
 * 		错误数据

 */
public class Demo02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score>=90 && score <=100) {
			System.out.println("优秀");
		}else if (score>=80 && score <90) {
			System.out.println("好");
		}else if (score>=70 && score <80) {
			System.out.println("良");
		}else if (score>=60 && score <70) {
			System.out.println("及格");
		} else {
			System.out.println("输入错误");
		}
		
		
		
	}

}
