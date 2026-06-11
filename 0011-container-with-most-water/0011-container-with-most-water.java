class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;

        while(i<j){
            int h=Math.min(height[i],height[j]);
            int water=(j-i)*h;
            max=Math.max(max,water);
            
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return max;



    }
}