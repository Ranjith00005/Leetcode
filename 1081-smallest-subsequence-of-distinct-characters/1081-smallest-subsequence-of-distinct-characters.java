class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        boolean[] present = new boolean[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            freq[c - 'a']--;

            if (present[c - 'a'])
                continue;

            while (!st.isEmpty()
                    && st.peek() > c
                    && freq[st.peek() - 'a'] > 0) {

                present[st.pop() - 'a'] = false;
            }

            st.push(c);
            present[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : st)
            ans.append(c);

        return ans.toString();
    }
}