class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
  
        int[] count = new int[100]; 
        int result = 0;

        for (int[] d : dominoes) {
            int a = d[0];
            int b = d[1];
            
            int key;
            if (a < b) {
                key = a * 10 + b;
            } else {
                key = b * 10 + a;
            }
            
           
            result += count[key];
            count[key]++;
        }

        return result;
    }
}
