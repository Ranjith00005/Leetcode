class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[5];
        String s="balon";

        for(int i=0;i<text.length();i++){
            for(int j=0;j<5;j++){
                if(text.charAt(i)==s.charAt(j)){
                    arr[j]++;
                }

            }
        }
        arr[2]=arr[2]/2;
        arr[3]=arr[3]/2;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
        }

        return min;
    }
}