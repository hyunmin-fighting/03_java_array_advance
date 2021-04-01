package step3_01.arrayAdvance;

//210401 19:56(3번부터) ~ 21:37

import java.util.Arrays;

// 210401 16:16 ~ 

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx40_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int arrayCnt = 0;
		
		while(true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			
			if(sel == 1) {
				if(arrayCnt==0) {
					scores = new int[arrayCnt  +1];
				}
				else if(arrayCnt>0) {
					int temp[] = scores;
					scores = new int[arrayCnt  +1];
					for(int i=0; i<temp.length; i++) {
						scores[i] = temp[i];
					}
					temp = null;
				}
				System.out.print("성적 입력 : ");
				int grade = scan.nextInt();
				scores[arrayCnt] = grade;
				arrayCnt++;	
				System.out.println("----------출력------------");
				System.out.println(Arrays.toString(scores));
				System.out.println();
			}
				
			else if (sel == 2) {
				System.out.print("삭제할 index입력 : ");
				int delIndex = scan.nextInt();
				int temp[] = new int[arrayCnt-1];

				int j=0;
				for(int i=0; i<scores.length; i++) {
					if(delIndex != i) {
						temp[j] = scores[i];
						j++;
					}
				}
				scores = null;
				scores = temp;
				temp = null;
				arrayCnt--;

				System.out.println("----------출력------------");
				
				System.out.println(Arrays.toString(scores));
				System.out.println();
			}
			
			
			else if (sel == 3) {
				System.out.print("삭제할 값입력 : ");
				int delVal = scan.nextInt();
				int temp[] = new int[arrayCnt-1];
				
				int j=0;
				int lock = -1;
				
				for(int i=0; i<scores.length; i++) {
					if(delVal != scores[i] || delVal == lock) {
						temp[j] = scores[i];
						j++;
						
					}
					else if(delVal == scores[i]) {
						delVal = lock;					//지울값이 같은수가 한개이상일때 한개만 지우고 해당수를 Lock을 걸어 다시 지우지 못하게함
					}
				}
				scores = null;
				scores = temp;
				temp = null;
				arrayCnt--;
				
				System.out.println("----------출력------------");
				
				System.out.println(Arrays.toString(scores));
				System.out.println();
				
			}
			
			// 여기서 부터 다시 하자
			else if (sel == 4) {
				System.out.print("삽입할 값입력 : ");
				int insertVal = scan.nextInt();				
				System.out.print("삽입할 인덱스 입력 : ");
				int insertIndex = scan.nextInt();
				
				if(insertIndex >= scores.length) {
					System.out.println("해당위치는 add를 하세요");
					System.out.println(Arrays.toString(scores));
				}
				
				
				else {
				int temp[] = new int[arrayCnt+1];
				int j = 0;
				
				for(int i=0; i<scores.length; i++) {
					if(insertIndex != i) {
						temp[j] = scores[i];
						j++;
					}
					else if(insertIndex == i && insertIndex <= i) {
						temp[insertIndex] = insertVal;
						j++;
						i--;
						insertIndex = -1;
					}
					
				}
				
				scores = null;
				scores = temp;
				temp = null;
				arrayCnt++;
				
				System.out.println("----------출력------------");
				
				System.out.println(Arrays.toString(scores));
				System.out.println();
				}
			}
			else if (sel == 0) {
				break;
			}
		
		}

		scan.close();
	}

}
