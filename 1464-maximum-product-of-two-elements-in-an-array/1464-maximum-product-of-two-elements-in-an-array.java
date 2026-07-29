class Solution {
    public int maxProduct(int[] nums) {
        int a=0;
        int b=0;

        for(int i:nums){
            if(i<=a){
                if(i>=b){
                    b=i;
                }

            }
            else{
                b=a;
                a=i;
                
            }
        }

        return (a-1)*(b-1);
    }
}