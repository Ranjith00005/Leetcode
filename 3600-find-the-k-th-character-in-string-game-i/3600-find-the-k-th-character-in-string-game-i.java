class Solution {
    public char kthCharacter(int k) {
        StringBuilder str= new StringBuilder("a");
        int n=str.length();
        while(n<k){
            n=str.length();
            for(int i=0;i<n;i++){
                str.append((char) ('a' + ((str.charAt(i)-'a') + 1) %26));
            }
        }
        return str.charAt(k-1);
    }
}