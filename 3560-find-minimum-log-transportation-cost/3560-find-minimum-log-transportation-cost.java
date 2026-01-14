class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long res=0;
        if(n>k) {
            res+=((long)(n-k)*k);
        }
        if(m>k){
            res+=((long)(m-k)*k);
        }
        return res;
    }
}