class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();

        int n=grid.length;
        int m=grid[0].length;

        int fresh=0;
        int min=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                else if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        else if(queue.isEmpty()){
            return -1;
        }


        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};

        while(!queue.isEmpty()){
            int s=queue.size();

            while(s-->0){
                int[] cell=queue.poll();

                int x=cell[0];
                int y=cell[1];

                for(int d[]:dir){
                    int nx=x+d[0];
                    int ny=y+d[1];
                

                    if(nx>=0 && nx<n && ny>=0 && ny<m && grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        fresh--;
                        queue.add(new int[]{nx,ny});
                    }
                    
                }

            }
            min++;
        }

        if(fresh!=0){
            return -1;
        }
        return min-1;
    }
}