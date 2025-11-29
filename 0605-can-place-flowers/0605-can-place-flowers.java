class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         if (n == 0) return true;  
        int len=flowerbed.length;
        
        int c=0;
        for(int i=0;i<len;i++){

            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0 ) && (i==len -1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                
                c++;
                
            }
            if(c==n){
                    return true;
                }
                
            
        }
        return false;
    }
}