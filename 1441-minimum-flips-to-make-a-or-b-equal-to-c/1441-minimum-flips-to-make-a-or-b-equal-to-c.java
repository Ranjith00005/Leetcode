class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        for(int i=0;i<32;i++){
            int abit=0,bbit=0,cbit=0;
            if((a&(1<<i))!=0){
                abit=1;
            }
            if((b&(1<<i))!=0){
                bbit=1;
            }
            if((c&(1<<i))!=0){
                cbit=1;
            }
            if(cbit==1){
                if(abit==0&&bbit==0){
                    count+=1;
                }
            }
            if(cbit==0){
                if(abit==1){
                    count+=1;
                }
                if(bbit==1){
                    count+=1;
                }
            }
        }
        return count;
    }
    }
