class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pro[]=new int[n];
        int pre=1;
        for(int i=0;i<n;i++){
            pro[i]=pre;
            pre*=nums[i];
        }
        int suf=1;
        for(int i=n-1;i>=0;i--){
            pro[i]*=suf;
            suf*=nums[i];
        }
        return pro;
    }}