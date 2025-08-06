class Solution {
    
    private static int dfs(int[][] matrix,int[][] dp,int r,int c,int row,int col){
        if(dp[r][c]>0){
            return dp[r][c];
        }
        int longest=0;
        int[][] track=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0;i<4;i++){
            int adjrow=r+track[i][0];
            int adjcol=c+track[i][1];
            
            if(adjrow>=0 && adjrow<row && adjcol>=0 && adjcol<col && matrix[adjrow][adjcol]>matrix[r][c]){
                int adjpath=dfs(matrix,dp,adjrow,adjcol,row,col);
                longest=Math.max(adjpath,longest);
            }
        }
        dp[r][c]=longest+1;
        return dp[r][c];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int dp[][]=new int[row][col];
        int longest=-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int path=dfs(matrix,dp,i,j,row,col);
                longest=Math.max(path,longest);
            }
        }
        return longest;
    }
}
    