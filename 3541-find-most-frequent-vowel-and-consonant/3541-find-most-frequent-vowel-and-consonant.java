class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
       
        int n=s.length();
        for(Character c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        int Vcount=0;
        int Ccount=0;
        for(Character c: freq.keySet()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                Vcount=Math.max(Vcount,freq.get(c));
            }
            else{
                Ccount=Math.max(Ccount,freq.get(c));
            }
        }
        return Vcount+Ccount;

    }
}