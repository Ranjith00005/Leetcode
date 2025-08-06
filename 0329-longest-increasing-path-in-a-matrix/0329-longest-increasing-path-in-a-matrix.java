class Solution {
    private static int[][] offset = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    private static boolean check(int i, int j, int R, int C){
        return (i >= 0 && i < R && j >= 0 && j < C);
    }

    private static int dfs(int[][] matrix, int[][] dp, int row, int col, int R, int C){
        if(dp[row][col] != 0)
            return dp[row][col];

        int longest = 0;
        for(int i=0; i<4; i++){ 
            int nextR = offset[i][0] + row;
            int nextC = offset[i][1] + col;

            if(!check(nextR, nextC, R, C))
                continue;

            if(matrix[nextR][nextC] > matrix[row][col]){
                int adjPath = dfs(matrix, dp, nextR, nextC, R, C);
                longest = Math.max(adjPath, longest);
            }    
        }    

        dp[row][col] = longest + 1;
        return dp[row][col];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int dp[][] = new int[R][C];

        int path = 0, longest = 0;

        for(int row=0; row<R; row++){
            for(int col=0; col < C; col++){
                if(dp[row][col] == 0){
                    path = dfs(matrix, dp, row, col, R, C);
                    //int dop = Math.max(path, dp[row][col]);
                    longest = Math.max(path, longest);
                }
            }
        }

        return longest;
    }
}