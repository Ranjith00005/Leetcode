class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int r=num;

        while(l<=r){
            int mid=(l+r)/2;
            long msq=(long)mid*mid;
            if(msq==num) return true;
            else if(msq>num) r=mid-1;
            else{
                l=mid+1;
            }
        }
        return false;
    }
}