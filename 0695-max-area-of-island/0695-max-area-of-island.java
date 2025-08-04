class Solution {
  
    private static int dfs(int[][] grid,int r,int c,int row,int col){
        grid[r][c]=5;
        int[][] track=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int count=1;
        for(int i=0;i<4;i++){
            int adjrow=r+track[i][0];
            int adjcol=c+track[i][1];
            
            if(adjrow>=0 && adjrow<row && adjcol>=0 && adjcol<col && grid[adjrow][adjcol]==1){
                
                
                
                count+= dfs(grid,adjrow,adjcol,row,col);
            }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int max=0;
        int total=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                
                if(grid[i][j]==1){
                    total=dfs(grid,i,j,row,col);
                }
                max=Math.max(max,total);
            }
        }
        return max;
    }
}