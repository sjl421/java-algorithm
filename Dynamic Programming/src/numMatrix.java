
public class numMatrix {
    int[][] dp;
    int c1 ,r1, c2, r2;
    
    
    public numMatrix(int[][] matrix) {
        if(matrix.length == 0) return;
        dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for(int i = 1; i < matrix.length; i++)
        	dp[i][0] = dp[i-1][0] + matrix[i][0];
        for(int i = 1; i < matrix[0].length; i++)
        	dp[0][i] = dp[0][i-1] + matrix[0][i];
        
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                dp[i][j] = dp[i-1][j-1];
                for(int k = 0; k <= j; k++) 
                    dp[i][j] += matrix[i][k];
                for(int h = 0; h <= i-1; h++)
                    dp[i][j] += matrix[h][j]; 
                 System.out.println("dp["+i+"]["+j+"] = "+ dp[i][j]);
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 ==0 && col1 ==0) 
            return dp[row2][col2];
        else if(row1 == 0 && col1 !=0)
            return dp[row2][col2] - dp[row2][col1-1];
        else if(row1 !=0 && col1 ==0)
            return dp[row2][col2] - dp[row1-1][col2];
        else
        // initialEdge(r1,row1);
        // initialEdge(r2, row2);
        // initialEdge(c1, col1);
        // initialEdge(c2, col2);
        return dp[row2][col2] - dp[row2][col1-1] - dp[row1-1][col2] + dp[row1-1][col1-1];
    }
    
    private void initialEdge(int real, int input) {
        if(input == 0) real = input;
        else real = input - 1;
    }
}


/* [3,0,1,4,2]
   [5,6,3,2,1]
   [1,2,0,1,5]
   [4,1,0,1,7]
   [1,0,3,0,5]

sumRegion(2,1,4,3),sumRegion(1,1,2,2),sumRegion(1,2,2,4)*/