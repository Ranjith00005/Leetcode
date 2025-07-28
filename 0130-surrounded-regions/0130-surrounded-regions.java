class Solution {
    private static void dfs(char[][] grid,int r,int c,int row,int col){
        int offset[][]=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        grid[row][col]='R';
        for(int i=0;i<4;i++){
            int adjrow= row+offset[i][0];
            int adjcol= col+offset[i][1];
            if(adjrow >= 0 && adjrow < r && adjcol >= 0 && adjcol < c){
                if(grid[adjrow][adjcol]=='O'){
                    dfs(grid,r,c,adjrow,adjcol);
                }
            }
            
        }
    }
    
    public void solve(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            if(grid[i][0]=='O'){
                dfs(grid,row,col,i,0);
            }
            if(grid[i][col-1]=='O'){
                dfs(grid,row,col,i,col-1);
            }
        }
        for(int j=0;j<col;j++){
            if(grid[0][j]=='O'){
                dfs(grid, row, col,0,j);
            }
            if(grid[row-1][j]=='O'){
                dfs(grid,row,col,row-1,j);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='O'){
                    grid[i][j]='X';
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='R'){
                    grid[i][j]='O';
                }
            }
        }

    }
}
