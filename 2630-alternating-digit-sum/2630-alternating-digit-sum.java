class Solution {
    public int alternateDigitSum(int n) {

        char[] arr= String.valueOf(n).toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || i%2==0){
                sum+=Character.getNumericValue(arr[i]);
            }
            else{
                sum-=Character.getNumericValue(arr[i]);
            }
        }
        return sum;

    }
}