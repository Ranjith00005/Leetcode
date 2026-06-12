class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre=1;

        int prod[]=new int[n];

        for(int i=0;i<n;i++){
         prod[i]=pre;
         pre*=nums[i];
        }

        int suf=1;

        for(int j=n-1;j>=0;j--){
            prod[j]*=suf;
            suf*=nums[j];
        }

        return prod;
    }
}