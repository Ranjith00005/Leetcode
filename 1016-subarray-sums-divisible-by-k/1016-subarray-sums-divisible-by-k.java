class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       Map<Integer,Integer> h=new HashMap<>();
        int sum=0,count=0,rem=0;
        h.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum%k;
            
            if(rem<0){
            rem+=k;}
            
            if(h.containsKey(rem)){
                count+=h.get(rem);
                h.replace(rem,h.get(rem)+1);
           
            }
        
            else{
                h.put(rem,1);
            }
            
        }
        return count;
    }
} 
    