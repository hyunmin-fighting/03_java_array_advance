package step3_01.arrayAdvance;

/*
 * 
 * # 나만의 마블
 * 
 * P □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */


public class ArrayEx49_정답 {

	public static void main(String[] args) {

		int size = 5;
		int num = 20;
		int player = 0;
		
		
		int[][] map = {
				{0,   1,  2,  3, 4},	
				{15, 20, 20, 20, 5},
				{14, 20, 20, 20, 6},
				{13, 20, 20, 20, 7},
				{12, 11, 10,  9, 8}
			};
			
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(map[i][j] == num) System.out.print("■" + " ");
				else if(map[i][j] == player) System.out.print("P" + " ");
				else System.out.print("□" + " ");
			}
			System.out.println();
		}
			
	}

}
