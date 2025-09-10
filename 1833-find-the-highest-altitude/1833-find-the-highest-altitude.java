class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
		int alt = 0;
		for (int val : gain) {
			alt += val;
			maxAlt = Math.max(maxAlt, alt);
		}
		return maxAlt;
    }
}