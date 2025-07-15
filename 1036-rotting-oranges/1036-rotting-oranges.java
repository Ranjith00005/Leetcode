class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int visited[][]=grid;
        Queue<int[]> ll=new LinkedList<>();
        int fo=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==2){
                    ll.add(new int[] {i,j});

                }
                if(visited[i][j]==1){
                    fo++;
                }
            }
        }
        if(fo==0){
            return 0;
        }
        if(ll.isEmpty()){
            return -1;
        }
        
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        int min=-1;
        while(!ll.isEmpty()){
            int s=ll.size();
            while(s-- > 0){
                int cell[]=ll.poll();
                int x=cell[0];
                int y=cell[1];
                for(int []d:dir){
                    int i=x + d[0];
                    int j=y + d[1];
                    if(i>=0 &&i<m && j>=0 &&j<n && visited[i][j]==1){
                        visited[i][j]=2;
                        fo--;
                        ll.add(new int[] {i,j});
                    }

                }
            }
            min++;
        }

        
        if(fo==0){
            return min;

        }
        else{
            return -1;
        }
    }
}
