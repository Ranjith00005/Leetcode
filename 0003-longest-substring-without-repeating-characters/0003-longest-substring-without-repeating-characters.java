class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;

        for(int i=0;i<n;i++){
            int count=0;
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    
                    break;

                }

                
            }
        }
        return max;
    }
}