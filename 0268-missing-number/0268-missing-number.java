class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=x){
                return x;
            }
            x++;
            //reutrn 
        }
        return x;
    }
}