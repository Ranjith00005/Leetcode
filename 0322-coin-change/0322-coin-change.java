class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] mincoin= new int[amount+1];
        Arrays.fill(mincoin,amount+1);
        mincoin[0]=0;
        for(int i=1;i<amount+1;i++){
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    mincoin[i]=Math.min(mincoin[i - coins[j]]+1,mincoin[i]);

                }
            }
        }
        return mincoin[amount] != amount+1 ? mincoin[amount] :-1;
        }
    }
