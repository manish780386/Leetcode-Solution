class Solution {
   public boolean uniformArray(int[] nums1) {

        int odd = 0;
        int even = 0;

        for (int x : nums1) {
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // All already have same parity
        if (odd == 0 || even == 0) {
            return true;
        }

        // If both parities exist, we can make every element odd
        // by subtracting an element having opposite parity.
        return true;
    }
}