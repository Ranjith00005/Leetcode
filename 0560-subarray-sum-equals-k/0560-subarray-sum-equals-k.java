class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> h=new HashMap<>();
        int sum=0,co=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                co++;
            }
            if(h.get(sum-k)!=null){
                co+=h.get(sum-k);
               // h.replace(sum,h.get(sum-k)+1);
            }
            
            if(h.get(sum)!=null){
            int prev=h.get(sum);
            h.replace(sum,prev+1);
            }
            else{
                h.put(sum,1);
            }
            
        }
        return co;
    }
}