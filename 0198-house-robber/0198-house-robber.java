class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1){
            return nums[0];
        }
        int[] m = new int[n];
        m[0]=nums[0];
        m[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            m[i]=Math.max(m[i-1],nums[i]+m[i-2]);
        }
        return m[n-1];
    }
}