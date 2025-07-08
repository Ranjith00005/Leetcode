class Solution {
    public int lengthOfLongestSubstring(String s) {
   int i=0,j=0,count=0;
        Map<Character,Integer> h=new HashMap<>();
        
        for(i=0;i<s.length();i++){
            
            if(h.containsKey(s.charAt(i))){
               h.replace(s.charAt(i),h.get(s.charAt(i))+1);

                if(h.get(s.charAt(i))==2){
                    while(h.get(s.charAt(i))!=1){
                        
                        h.replace(s.charAt(j),h.get(s.charAt(j))-1);
                        j++;
                    }
                } 
            }
            else
            h.put(s.charAt(i),1);

            if(count<(i-j+1)){
                        count=(i-j+1);
            }
            
        }
            return (count);
    
    }
}