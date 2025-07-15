class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder(); 

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (ans.length() > 0) {
                    ans.deleteCharAt(ans.length() - 1);  
                }
            } else {
                ans.append(ch);   
            }
        }

        return ans.toString();                                
    }
}
