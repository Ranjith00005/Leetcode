class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        int max=-1;
        for(int i=0;i<n-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                int digit = num.charAt(i) - '0'; 
                max = Math.max(max, digit);
            }
        }
        return max== -1 ? "" : String.valueOf((char)(max + '0')).repeat(3);
    }
}