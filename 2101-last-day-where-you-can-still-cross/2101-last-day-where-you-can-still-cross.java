class Solution {
    private int getIndex(int R,int C,int row,int col){
        return C*row+col+1;
    }
    private void join(int left,int right,int[] leader){
        leader[find(right,leader)]=find(left,leader);
    }
    private int find(int node,int[] leader){
        if(node==leader[node]){
            return node;
        }
        leader[node]=find(leader[node],leader);
        return leader[node];
    }
    public int latestDayToCross(int R, int C, int[][] cells) {
        int leader[]=new int[R*C+2];
        int days=0;
        for(int i=0;i<R*C+2;i++){
           leader[i]=i;
        }
        int[][] diff=new int[][]{{0,-1},{0,1},{-1,0},{1,0},{-1,-1},{1,1},{1,-1},{-1,1}};
        boolean[][] water=new boolean[R][C];
        for(int[] cell:cells){
            int row=cell[0]-1;
            int col=cell[1]-1;
            water[row][col]=true;
            for(int i=0;i<8;i++){
                int adjR=row+diff[i][0];
                int adjC=col+diff[i][1];
                if(adjR>=0 && adjR<R && adjC>=0 && adjC<C){
                    if(water[adjR][adjC]){
                        join(getIndex(R,C,adjR,adjC),getIndex(R,C,row,col),leader);
                    }
                }
            }
            if(col==0){
                join(0,getIndex(R,C,row,col),leader);
            }
            if(col==C-1){
                join(getIndex(R,C,row,col),R*C+1,leader);
            }
            if(find(leader[0],leader)==find(leader[R*C+1],leader)){
                return days;
            }
            days++;
        }
        return -1;
    }
}