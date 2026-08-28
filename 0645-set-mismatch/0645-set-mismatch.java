class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate=find(nums);
        int missing=miss(nums,duplicate);
        int[] res=new int[]{duplicate,missing};

        return res;
    }
    public static int find(int[] nums){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
        
    }

    public static int miss(int[] nums,int dup){
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}