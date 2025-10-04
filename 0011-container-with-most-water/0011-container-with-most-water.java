class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length - 1;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int count= j-i;
            int water= count*h;
            max=Math.max(water,max);

            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}