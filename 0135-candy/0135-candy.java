class Solution {
    public int candy(int[] rating) {
        int n=rating.length;
        int dp[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            dp[i]=1; 
        }
        for(int i=1;i<n;i++){
            if(rating[i-1]<rating[i]){
                dp[i]=dp[i-1]+1;
            }

        }
        for(int i=n-1;i>0;i--){
            if(rating[i-1]>rating[i]){
                int temp=dp[i]+1;
                dp[i-1]=Math.max(temp,dp[i-1]);
            }
        }

        for(int i=0;i<n;i++){
            count+=dp[i];
        }
        return count;

    }
}