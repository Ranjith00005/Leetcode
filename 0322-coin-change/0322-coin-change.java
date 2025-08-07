class Solution {
    public int coinChange(int[] coin, int amount) {

        int [] count= new int[amount+1];
        Arrays.fill(count,amount+1);
        count[0]=0;
        for(int i=0;i<coin.length;i++){
            for(int j=0;j<count.length;j++){
                if(j-coin[i]>=0){
                int x=count[j-coin[i]]+1;
                count[j]=Math.min(count[j],x);
                }
            }
        }
        if(count[amount]==amount+1){
            return -1;
        }
        return count[amount];

    }
}