class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();

        int n=word.length();
        int count=0;
        int press=0;
        int push=1;

        for(int i=0;i<n;i++){
            char x=word.charAt(i);

            if(map.containsKey(x)){
                press+=map.get(x);
            }
            else{
                if(count>7){
                    push++;
                    count=0;
                }
                map.put(x,push);
                press+=push;
                count++;
            }


        }
        return press;
    }
}