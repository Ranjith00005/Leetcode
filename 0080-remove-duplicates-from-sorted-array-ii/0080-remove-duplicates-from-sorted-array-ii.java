class Solution {
    public int removeDuplicates(int[] nums) {
 int j=1;
 int k=0;
        for(int i=1;i< nums.length;i++){
            if(nums[i]!= nums[i-1]){

            
            nums[j]=nums[i];
            j++;
            k=0;
            }
            else{
                k++;
                if(k<=1){
                    nums[j++]=nums[i];
                }
            }
            }
            return j;
        }
        
    }


