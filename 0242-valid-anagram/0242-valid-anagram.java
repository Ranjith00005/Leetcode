class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
       char str1[]=s.toCharArray();
       char str2[]=t.toCharArray();
        int i=0;
        int j=0;
        if(n!=m){
            return false;
        }

       Arrays.sort(str1);
       Arrays.sort(str2);


       while(i<n){
        if(str1[i]!=str2[j]){
            return false;
        }
        else{
            i++;
            j++;
        }
        } 
        return true;
    }
}