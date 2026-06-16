class Solution {
    public int trailingZeroes(int n) {
        int z=0;
        while(n>0){
            n=n/5;
            z+=n;
        }
        return z;
    }
}