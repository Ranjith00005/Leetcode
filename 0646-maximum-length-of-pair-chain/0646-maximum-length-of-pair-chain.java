class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));

        int skip=0;
        int end=pairs[0][1];

        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>end){
                end=pairs[i][1];
                skip++;
            }
        }
        return skip+1;
    }
}