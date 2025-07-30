class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int one=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                one = 0;
            }
            else{
                one++;
            }
            max=Math.max(one,max);
        }
        return max;
    }
}