class Solution {
    public String reverseWords(String s) {
         String[] word = s.split("\\s+");      
        StringBuilder f = new StringBuilder();
        for(int i = word.length-1;i>=0;i--){
            f.append(word[i]);
            if(i>0){
                f.append(" ");
            }

        }
        return f.toString().trim();
    }
}