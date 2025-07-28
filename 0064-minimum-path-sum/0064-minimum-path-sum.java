class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][]ex= new int[r][c];
        ex[0][0]=grid[0][0];
        for(int i=1;i<c;i++){
            ex[0][0]=grid[0][0];
            ex[0][i]+=grid[0][i]+ex[0][i-1];
            }
        for(int j=1;j<r;j++){
            ex[j][0]+=grid[j][0]+ex[j-1][0];
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                ex[i][j]=Math.min(ex[i-1][j],ex[i][j-1])+grid[i][j];


            }
        }
        return(ex[r-1][c-1]);

        }
    }
