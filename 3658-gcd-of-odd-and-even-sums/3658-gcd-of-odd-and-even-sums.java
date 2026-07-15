class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=n*(n+1);
        int b=n*n;

        while(a!=0){
            int temp=a;
            a=b%a;
            b=temp;

        }
        return b;
    }
}