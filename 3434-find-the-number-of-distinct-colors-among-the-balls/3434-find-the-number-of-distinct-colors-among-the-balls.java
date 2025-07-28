class Solution {
    public int[] queryResults(int limit, int[][] q) {
        HashMap<Integer, Integer> colour = new HashMap<>();
        HashMap<Integer, Integer> colorFrequency = new HashMap<>();
        int n = q.length;
        int[] color = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int ball = q[i][0];
            int newColor = q[i][1];

            if (colour.containsKey(q[i][0])) {
                int pc = colour.get(q[i][0]);
                colorFrequency.put(pc, colorFrequency.get(pc) - 1);
                // count--;
                
                if (colorFrequency.get(pc) == 0) {
                    count--;
                }
            }
            colour.put(q[i][0], q[i][1]);
            colorFrequency.put(q[i][1], colorFrequency.getOrDefault(q[i][1], 0) + 1);

            if (colorFrequency.get(q[i][1]) == 1) {
                count++;
            }
            color[i] = count;
        }
        
    
    return color;
}
}