package step3_01.arrayAdvance;

import java.util.Arrays;

// 210331 17:00 ~ 17:30 (다시한번 Check 필요)

/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx37_정답 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		int total = 0;
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		System.out.println("========가로합===========");

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				}
				garo[i] = total;
				total = 0;
			}
		System.out.println(Arrays.toString(garo));
		
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		System.out.println("========세로합===========");
		

	
		int data1 = 0;
		int data2 = 0;
		int data3 = 0;
		int data4 = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(j==0) {
					data1 += arr[i][j];
				}
				else if(j==1) {
					data2 += arr[i][j];
				}
				else if(j==2) {
					data3 += arr[i][j];
				}
				else if(j==3) {
					data4 += arr[i][j];
				}
			}
		}
		sero[0] = data1;
		sero[1] = data2;
		sero[2] = data3;
		sero[3] = data4;
		
		System.out.println(Arrays.toString(sero));
		
		
	}
}

	
	



