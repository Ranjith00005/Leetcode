class Solution {
    public int rearrangeCharacters(String s, String target) {
        int n=s.length();
        int m=target.length();
        int a[]=new int[26];
        int b[]=new int[26];
        int min=Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']++;
        }
        for(int j=0;j<m;j++){
            b[target.charAt(j)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(b[i]>0){
                min=Math.min(a[i]/b[i],min);
            }
        }

        return min;

        
    }
}