class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        int n=words.length;
        // int last=n;
        // for(int i=0;i<n/2;i++){
        //     String temp=words[i];
        //     words[i]=words[last-1];
        //     words[last-1]=temp;
        //     last=last-1;
        // }
        // return words.toString().trim();

        StringBuilder result=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            result.append(words[i]);
            result.append(" ");

        }
        return result.toString().trim();


    }
}