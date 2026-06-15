class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<dp.length;j++){
                if(j-coins[i]>=0){
                    int x=dp[j-coins[i]]+1;
                    dp[j]=Math.min(x,dp[j]);
                }
            }

        }
        if(dp[amount]==amount+1){
            return -1;
        }
        
            return dp[amount];
        
    }
}