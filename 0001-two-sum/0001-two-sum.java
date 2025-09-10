class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
Map<Integer,Integer> num = new HashMap<>();
for(int i=0;i<n;i++){
    if(num.containsKey(target-nums[i])){
        return new int[] {i,num.get(target-nums[i])};
    }
    num.put(nums[i],i);


}
return new int[]{};
    }}