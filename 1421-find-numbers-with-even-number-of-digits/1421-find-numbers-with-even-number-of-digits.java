class Solution {
    public int findNumbers(int[] nums) {
        //int cd=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            int cd=0;
            while(nums[i]>0){
                
                nums[i]=nums[i]/10;

                cd++;
            }
            if(cd%2==0){
                c++;
            }
        }
        return c;
    }
}