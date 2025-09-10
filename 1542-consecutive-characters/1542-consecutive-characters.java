class Solution {
    public int maxPower(String s) {
        int c=1,p=1;
        
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                p++;
            }
            else{
                p=1;
            }
            c=Math.max(c,p);
        }
        return c;
    }
}