class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int i=n-1;

        while(i>=0){

        
            int a=(int)num.charAt(i);
            if(a%2==0){
                i--;
            }
            else{
                return num.substring(0,i+1);
            }

        }
        return "";
    }
}