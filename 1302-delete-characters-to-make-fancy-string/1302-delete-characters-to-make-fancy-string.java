class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int count = 1;  

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                str.append(s.charAt(i - 1));
            }
        }

        
        if (n > 0) str.append(s.charAt(n - 1));

        return str.toString();
    }
}
