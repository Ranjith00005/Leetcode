class Solution {
    public int findRadius(int[] houses, int[] heaters) {

        
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0;

        for(int house: houses){
           
            int min = Integer.MAX_VALUE;
            for(int heater: heaters){
                int diff = Math.abs(house - heater);
                min = Math.min(min, diff);
                if(min == 0) break;

            }
            res = Math.max(res, min);

        }
        return res;
        
    }
}