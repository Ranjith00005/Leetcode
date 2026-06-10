class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean vis[]=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){

            if(!vis[i]){
                count++;
                dfs(isConnected,i,vis);
            }
        }
        return count;
    }
    public void dfs(int[][] connected,int curr,boolean[] vis){
        vis[curr]=true;
        for(int i=0;i<connected.length;i++){
            if(!vis[i]){
                if(connected[curr][i]==1){
                    dfs(connected,i,vis);
                }
        }
            
        }

    }

}