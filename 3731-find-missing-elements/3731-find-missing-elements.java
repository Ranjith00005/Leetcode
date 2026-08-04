class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.length;
        int i=1;
        int val=nums[0];
        while(i<n){
            val++;
            if(val < nums[i]){
                list.add(val);

            }
            else{
                i++;
            }
            
        }
        return list;
    }

}