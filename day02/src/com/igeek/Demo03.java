package com.igeek;

/**
 * @author zx
 * @date 2019年7月2日
 * @version 1.0
 * @description：
 *  格式1：数据类型[] 数组名;
	格式2：数据类型 数组名[];
	
	数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};
 * 
 * 		简化格式：
 * 	数据类型[] 数组名 = {元素1,元素2,...};


 */
public class Demo03 {
	
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int arr2[] = new int[] {1,2,3,4,5};
		int arr3[] = {1,2,3,4,5};
		
		//java.lang.ArrayIndexOutOfBoundsException:
		System.out.println(arr1);
		System.out.println(arr1[0]);
		//System.out.println(arr1[5]);
		
		System.out.println(arr1[arr1.length-1]);
		
		
	}

}
