package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：
 *  需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 其余4个评委打分的平均值。
 * 请写代码实现。(不考虑小数部分)
 * 
 */
public class Demo20 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请"+(i+1)+"评委打分：");
			int number = scanner.nextInt();
			arr[i] = number;
		}
		
		int max = getMax(arr);
		int min = getMin(arr);
		
		int sum = sum(arr);
		
		int agv = (sum-max-min)/(arr.length-2);
		System.out.println(agv);

	}

	public static int sum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		return max;
	}

}
