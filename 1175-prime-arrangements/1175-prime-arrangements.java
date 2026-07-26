class Solution {

    static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {

        int primes = countPrimes(n);

        int nonPrimes = n - primes;

        long ans = factorial(primes);
        ans = (ans * factorial(nonPrimes)) % MOD;

        return (int) ans;
    }

    private int countPrimes(int n) {

        int count = 0;

        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(int x) {

        if (x < 2) {
            return false;
        }

        for (int i = 2; i * i <= x; i++) {

            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    private long factorial(int n) {

        long ans = 1;

        for (int i = 2; i <= n; i++) {
            ans = (ans * i) % MOD;
        }

        return ans;
    }
}