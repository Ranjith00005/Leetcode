class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0;

        for(int i=n-1;i>=2;i--){
            int r=i-1;
            int l=0;
            while(l<r){
                if(nums[r]+nums[l]>nums[i]){
                    c+=r-l;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return c;
    }
}