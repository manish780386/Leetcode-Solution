import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int x : aliceSizes) sumA += x;
        for (int y : bobSizes) sumB += y;
        
        Arrays.sort(bobSizes);
        int delta = (sumB - sumA) / 2;
        
        for (int x : aliceSizes) {
            int target = x + delta;
            if (Arrays.binarySearch(bobSizes, target) >= 0) {
                return new int[]{x, target};
            }
        }
        
        return new int[0];
    }
}