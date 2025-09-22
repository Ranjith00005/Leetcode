class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int mf=0;
        int sum=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            mf=Math.max(map.get(nums[i]),mf);
        }
        for(int f :map.values()){
            if(f==mf){
                sum+=f;
            }
        }
        return sum;


    }
}