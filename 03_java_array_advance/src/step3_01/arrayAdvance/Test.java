package step3_01.arrayAdvance;

public class Test {
	public static void main(String[] args) {
		
	
	int[][] arr = {{0,0,0},{0,0,0},{0,0,0}};
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
