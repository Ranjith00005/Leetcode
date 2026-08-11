class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int n=nums.length;
        int sum=nums[0];
        int index=0;

        for(int i=0;i<n-1;i++){
            if(nums[i+1]-nums[i]==1){
                sum+=nums[i+1];
            }
            else{
                index=i+1;
                break;

            }
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}