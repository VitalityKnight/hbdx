package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：二维数组:数组的数组
 */
public class Demo07 {
	
	public static void main(String[] args) {
		
		int[][] arr = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		int arr2[][];
		
		int[] arr3[];
		
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][2]);
		
		//遍历二维数组
		int[][] arr4={{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*********");
		for (int[] a : arr4) {
//			for (int i = 0; i < a.length; i++) {
//				System.out.print(a[i] + " ");
//			}
			for (int temp : a) {
				System.out.print(temp+" ");
			}
			System.out.println();
		}

		
		
		
		
	}

}
