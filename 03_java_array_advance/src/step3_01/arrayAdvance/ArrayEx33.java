package step3_01.arrayAdvance;

import java.util.Arrays;

// 배열의 주소

public class ArrayEx33 {

	public static void main(String[] args) {
		
		int[] arr = {12, 23, 42, 58, 72};
		int[] temp = arr;
		
		System.out.println("arr : " + arr);
		System.out.println("temp : " + arr);
		System.out.println();
	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		arr[0] = 0;
		temp[1] = 0;
		arr[2] = 0;
		temp[3] = 0;
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		
	}
	
}
