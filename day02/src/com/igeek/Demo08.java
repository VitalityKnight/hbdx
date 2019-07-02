package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：打印杨辉三角形（7行）
 * 杨辉三角，是二项式系数在三角形中的一种几何排列
 */
public class Demo08 {
	
	public static void main(String[] args) {
		
		int level = 7;
		int[][] yangHui = new int[level][];
		
		for (int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i+1];
		}
		
		//第一行
		yangHui[0][0] = 1;
		
		for (int i = 1; i < yangHui.length; i++) {
			//每个数组的第一个元素值1
			yangHui[i][0] = 1;
			
			for (int j = 1; j < yangHui[i].length-1; j++) {
				yangHui[i][j] = yangHui[i-1][j]+yangHui[i-1][j-1];
			}
			//每个数组的最后一个元素值1
			yangHui[i][yangHui[i].length-1] = 1;
		}
		
		//遍历打印
		for (int[] is : yangHui) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
	}

}
