package codinginterview;

public class Problem1_8 {
	public static void main(String[] args) {
		int [][] m = {{3,2,4}, {0,4,5}, {2,4,3}};
		printArray(m);
		m = checkForZeros(m);
		printArray(m);
	}
	public static void printArray(int [][]m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] +" ");
			}
			System.out.println();
		}
	}
	public static int [][] checkForZeros(int [][] m) {
		boolean [] rowsToZero = new boolean [m.length];
		boolean [] colsToZero = new boolean [m[0].length];
 		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				if(m[i][j] == 0){
					rowsToZero[i] = true;
					colsToZero[j] = true;
				}
				
			}
		}
 		for(int i = 0; i < rowsToZero.length; i++){
 			if(rowsToZero[i] ){
 				m =changeRow(i, m);
 			}
 		}
 		for(int i = 0; i < colsToZero.length; i++){
 			if(colsToZero[i] ){
 				m = changecol(i, m);
 			}
 		}
 		return m;
		
	}
	public static int [][] changecol(int column, int [][] m){
		for(int i = 0; i < m.length; i++){
			m[i][column]= 0;
		}
		return m;
	}
	public static int [][] changeRow(int row,int [][] m){
		for(int j = 0; j < m[0].length; j++){
			m[row][j]= 0;
		}
		return m;
	}
}