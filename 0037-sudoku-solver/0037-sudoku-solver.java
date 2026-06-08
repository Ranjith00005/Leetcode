class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char val='1';val<='9';val++){
                        if(isvalid(i,j,val,board)){
                            board[i][j]=val;
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }

                        }
                        
                    }
                    return false;
                }
                
            }
        }
        return true;
    }

    private boolean isvalid(int row,int col,char val,char[][] board){
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;

        for(int i=0;i<9;i++){
            if(board[row][i]==val || board[i][col]==val){
                return false;
            }
        }

        for(int r=startrow;r<startrow+3;r++){
            for(int c=startcol;c<startcol+3;c++){
                if(board[r][c]==val){
                    return false; 
                }
            }

        }
        return true;
    }


}