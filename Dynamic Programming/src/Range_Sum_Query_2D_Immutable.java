
public class Range_Sum_Query_2D_Immutable {
	// Your NumMatrix object will be instantiated and called as such:
	// NumMatrix numMatrix = new NumMatrix(matrix);
	// numMatrix.sumRegion(0, 1, 2, 3);
	// numMatrix.sumRegion(1, 2, 3, 4);
	public static void main(String args[]) {
		int[][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
		numMatrix numMatrix = new numMatrix(matrix);
		System.out.println("numMatrix.sumRegion(2,1,4,3) = "+numMatrix.sumRegion(2,1,4,3));
	}

}
/* [3,0,1,4,2]
   [5,6,3,2,1]
   [1,2,0,1,5]
   [4,1,0,1,7]
   [1,0,3,0,5]

sumRegion(2,1,4,3),sumRegion(1,1,2,2),sumRegion(1,2,2,4)*/