class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();

        int n=s.length();

       for(int i=0;i<n;i++){
        if(map.containsKey(s.charAt(i))){
            if(map.get(s.charAt(i))!=t.charAt(i)){

                return false;
            }
            
        }
        else{
            if(map.containsValue(t.charAt(i))){
                return false;
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
       }

       return true;
    }
}