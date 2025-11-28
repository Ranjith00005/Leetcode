class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==1){
                int z=i+1;
                int c=0;
                while(z<n && nums[z]!=1){
                    z++;
                    c++;
                }
                if(z<n && c<k){
                    return false;
                }
                i=z;

            }
            else{
                i++;
            }

        }
        return true;
    }
}