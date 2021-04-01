package step3_01.arrayAdvance;

import java.util.Arrays;
import java.util.Scanner;

// 210331 17:30 ~ 20:41
/*
 *	# 관리비
*/

public class ArrayEx38_정답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		int total = 0;
		int[] payOfFloor = new int[3];
		
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				total += pay[i][j];
			}
			payOfFloor[i] = total;
			total = 0;
		}
		System.out.println(Arrays.toString(payOfFloor));
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		
		System.out.println();
		int doorNum;
		int index1 = 0;
		int index2 = 0;
		
		System.out.print("호를 입력 : ");
		doorNum = scan.nextInt();
		
		for(int i=0; i<apt.length; i++) {
			for(int j=0; j<apt[i].length; j++) {
				if(doorNum == apt[i][j]) {
					index1 = i;
					index2 = j;
				}
			}
		}
		
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				if(index1 == i && index2 == j) {
					System.out.println(doorNum + "호의 관리비는 " + pay[i][j] + "원 입니다.");
				}
			}
		}
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		System.out.println();
		int maxFee = 0;
		int minFee = 100000000;
		int minIndex1 = 0;
		int minIndex2 = 0;
		int maxIndex1 = 0;
		int maxIndex2 = 0;
		int door1 = 0;
		int door2 = 0;
		
		for(int i=0; i<pay.length; i++) {
			for(int j=0; j<pay[i].length; j++) {
				if(pay[i][j] > maxFee) {
					maxFee = pay[i][j];
					maxIndex1 = i;
					maxIndex2 = j;
					
				}
				else if(pay[i][j] < minFee) {
					minFee = pay[i][j];
					minIndex1 = i;
					minIndex2 = j;
				}
			}
		}
		door1 = apt[maxIndex1][maxIndex2];
		door2 = apt[minIndex1][minIndex2];

		System.out.println("가장 많이 나온 집(" + door1 + "호), 가장 적게 나온 집(" + door2 + "호)");
		
		// 문제 4) 호 2개를 입력하면 관리비 교체

		int aIndex1 = 0;
		int aIndex2 = 0;
		int bIndex1 = 0;
		int bIndex2 = 01;
		
		System.out.println();
		System.out.println("첫번째 집 호수 입력 : ");
		door1 = scan.nextInt();
		System.out.println("두번째 집 호수 입력 : ");
		door2 = scan.nextInt();
		
		for(int i=0; i<apt.length; i++) {
			for(int j=0; j<apt[i].length; j++) {
				if(door1 == apt[i][j]) {
					aIndex1 = i;
					aIndex2 = j;
				}
				else if(door2 == apt[i][j]) {
					bIndex1 = i;
					bIndex2 = j;
				}
			}
		}
		
		int val1 = pay[aIndex1][aIndex2];
		int val2 = pay[bIndex1][bIndex2];		
		
		 pay[aIndex1][aIndex2] = val2;
		 pay[bIndex1][bIndex2] = val1;
		 
		 for(int i=0; i<pay.length; i++) {
			 for(int j=0; j<pay[i].length; j++) {
				 System.out.println(pay[i][j]);
			 }
			 System.out.println();
		 }
		 
		
		scan.close();
		
	}

}
