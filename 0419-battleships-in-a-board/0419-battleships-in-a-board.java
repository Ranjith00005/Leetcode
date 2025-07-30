class Solution {
    private static void dfs(char[][] grid,int r,int c,int row,int col ){
        grid[r][c]='.';
        int[][] track= new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<4;i++){
            int adjrow=r+track[i][0];
            int adjcol=c+track[i][1];

            if(adjrow>=0 && adjrow<row && adjcol>=0 && adjcol< col && grid[adjrow][adjcol]=='X'){
                dfs(grid,adjrow,adjcol,row,col);
            }
        }
    }
    public int countBattleships(char[][] grid) {
        int ship=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='X'){
                    ship++;
                    dfs(grid,i,j,row,col);
                }
            }
        }
        return ship;
    }
}