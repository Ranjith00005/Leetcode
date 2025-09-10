class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int max=candies[0];
        List<Boolean> fin= new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            
            fin.add((candies[i]+extra)>=max);
        }
        return fin;
    }
}