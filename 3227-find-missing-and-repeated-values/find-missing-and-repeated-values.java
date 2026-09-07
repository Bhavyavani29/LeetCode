class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] flat = new int[size];
        int idx = 0;

        // Step 1: Flatten the grid into a 1D array
        for (int[] row : grid) {
            for (int num : row) {
                flat[idx++] = num;
            }
        }

        int d = -1, m = -1;

        // Step 2: Use in-place marking to find duplicate
        for (int i = 0; i < size; i++) {
            int index = Math.abs(flat[i]) - 1;
            if (flat[index] < 0) {
                d = Math.abs(flat[i]);
            } else {
                flat[index] = -flat[index];
            }
        }

        // Step 3: Find missing number
        for (int i = 0; i < size; i++) {
            if (flat[i] > 0) {
                m = i + 1;
                break;
            }
        }

        return new int[]{d, m};
    }
}
