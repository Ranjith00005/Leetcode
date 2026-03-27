class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        PriorityQueue <Integer> q=new PriorityQueue<>((a,b) ->b-a);
        int stops=0;
        int maxdist=startFuel;
        int i=0;
        while(maxdist<target){
            while( i<stations.length && stations[i][0]<=maxdist){
                q.add(stations[i][1]);
                i++;
            }
            if(q.isEmpty()){
                return -1;
            }
            maxdist+=q.poll();
            
            stops++;
        }
        return stops;

    }
}