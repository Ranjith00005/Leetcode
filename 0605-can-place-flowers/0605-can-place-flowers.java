class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int xn = 0;
        for (int i = 0; i < f.length; i++) {
           
            if (f[i] == 0 && 
                (i == 0 || f[i - 1] == 0) && 
                (i == f.length - 1 || f[i + 1] == 0)) {
                
                f[i] = 1; 
                xn++;     
                i++;
                if (xn == n) { 
                    return true;
                }
            }
        }
        return xn >= n;
    }
}
