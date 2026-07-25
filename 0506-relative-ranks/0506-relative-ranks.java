import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        // Sort indices based on score in descending order
        Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));
        
        String[] ans = new String[n];
        
        for (int rank = 0; rank < n; rank++) {
            int origIdx = indices[rank];
            if (rank == 0) {
                ans[origIdx] = "Gold Medal";
            } else if (rank == 1) {
                ans[origIdx] = "Silver Medal";
            } else if (rank == 2) {
                ans[origIdx] = "Bronze Medal";
            } else {
                ans[origIdx] = String.valueOf(rank + 1);
            }
        }
        
        return ans;
    }
}