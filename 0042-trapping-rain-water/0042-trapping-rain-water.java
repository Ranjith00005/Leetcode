class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int wat = 0;
        left[0]=0;
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(height[i-1], left[i - 1]);
        }
        right[n-1]=0;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = Math.max(height[j+1], right[j + 1]);
        }
        for (int k = 0; k < n; k++) {
            int val= (Math.min(left[k], right[k])) - height[k];
            if(val<0) val=0;

            wat+=val;
        }
        return wat;

    }
}