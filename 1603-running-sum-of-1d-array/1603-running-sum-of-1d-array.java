class Solution {
    public int[] runningSum(int[] nums) {
        int i=0;
        int c=0;
        while(i<nums.length){
           
            c+=nums[i];
             nums[i]=c;
            i++;
        }
        return nums;
    }
}