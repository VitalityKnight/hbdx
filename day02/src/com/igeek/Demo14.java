package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：
 * 方法的参数是引用类型：
 * 		形式参数的改变直接影响实际参数
 */
public class Demo14 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		change(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}
	
	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			//如果是偶数，2倍
			if(arr[i]%2 == 0) {
				arr[i] *= 2;
			}
		}
	}

}
