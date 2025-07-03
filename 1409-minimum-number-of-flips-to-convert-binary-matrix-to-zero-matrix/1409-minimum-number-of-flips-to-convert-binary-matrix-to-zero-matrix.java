class Solution {
    public int minFlips(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int start = 0;

        
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (mat[row][col] == 1) {
                    start |= (1 << (row * c + col));
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);
        int steps = 0;

        int[][] diff = new int[][]{{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            int qsize = queue.size();

            for (int i = 0; i < qsize; i++) {
                int currState = queue.poll();
                if (currState == 0) return steps; 

    
                for (int row = 0; row < r; row++) {
                    for (int col = 0; col < c; col++) {
                        int newState = currState;

                        for (int[] d : diff) {
                            int nr = row + d[0];
                            int nc = col + d[1];
                            if (nr >= 0 && nr < r && nc >= 0 && nc < c) {
                                newState ^= (1 << (nr * c + nc));
                            }
                        }

                        if (!visited.contains(newState)) {
                            visited.add(newState);
                            queue.add(newState);
                        }
                    }
                }
            }

            steps++;
        }

        return -1; 
    }
}
