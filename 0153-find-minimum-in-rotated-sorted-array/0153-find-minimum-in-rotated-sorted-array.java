class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int l = 0;
        int r = n-1;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+(r-l)/2;
            ans = Math.min(ans, nums[mid]);
            if(nums[l]<=nums[mid]){ 
                ans = Math.min(ans, nums[l]); 
                l = mid+1;
            }else if(nums[mid]<=nums[r]){ 
                r = mid-1;
            }
        }
        return ans;
    }
}