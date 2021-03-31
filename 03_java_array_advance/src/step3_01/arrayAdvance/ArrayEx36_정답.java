package step3_01.arrayAdvance;
// 210331 16:27 ~ 16:56
/*
 *	# 2차원배열 기본문제[2단계]
*/

import java.util.Scanner;

public class ArrayEx36_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		//--기본 출력--
		// 10 20 30
		// 40 50 60
		// 70 80 90
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		//--기본 출력--
		// 10 20 30
		// 40 50 60
		// 70 80 90
		
		int index1;
		int index2;
		
		System.out.print("1번 인덱스 입력 : ");
		index1 = scan.nextInt();
		System.out.print("2번 인덱스 입력 : ");
		index2 = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==index1 && j==index2) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
		
		//--기본 출력--
		// 10 20 30
		// 40 50 60
		// 70 80 90
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.println();
		System.out.print("값 입력 : ");
		int value = scan.nextInt();
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(value == arr[i][j]) {
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println("인덱스1 출력 : " + index1);
		System.out.println("인덱스2 출력 : " + index2);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		//--기본 출력--
		// 10 20 30
		// 40 50 60
		// 70 80 90
		
		System.out.println();
		System.out.println("-----MAX INDEX 출력----------");
		int maxNum = 0;
		int maxIndex1 = 0;
		int maxIndex2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] > maxNum) {
					maxNum = arr[i][j];
					maxIndex1 = i;
					maxIndex2 = j;
				}
			}
		}
		System.out.println(maxIndex1 + " " + maxIndex2);
		
		
		
		// 문제 4) 값 2개를 입력받아 값 교체
		
		//--기본 출력--
		// 10 20 30
		// 40 50 60
		// 70 80 90
		System.out.println();
		int aIndex1 = 0;
		int aIndex2 = 0;
		int bIndex1 = 0;
		int bIndex2 = 0;
		
		System.out.print("값1 입력 : ");
		int val1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int val2 = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(val1 == arr[i][j]) {
					aIndex1 = i;
					aIndex2 = j;
				}
				else if(val2 == arr[i][j]) {
					bIndex1 = i;
					bIndex2 = j;
				}
			}
		}
		
		int getData1 = arr[aIndex1][aIndex2];
		int getData2 = arr[bIndex1][bIndex2];
		
		arr[aIndex1][aIndex2] = getData2;
		arr[bIndex1][bIndex2] = getData1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}
