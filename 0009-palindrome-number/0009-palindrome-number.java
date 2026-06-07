class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int y=0;
        while(x>0){
            int rem=x%10;
            y=(y*10)+rem;
            x=x/10;
        }
        return temp==y;
    }
}