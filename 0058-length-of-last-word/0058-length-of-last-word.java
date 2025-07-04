class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int len = 0;
        
        // Skip trailing spaces
        int i = n - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}
