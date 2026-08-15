class Solution {

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public long maxPairStrength(int[] nums) {

        long max = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                long g = gcd(nums[i], nums[j]);

                long str = ((long) nums[i] * nums[j]) / (g * g);

                max = Math.max(max, str);
            }
        }

        return max;
    }
}