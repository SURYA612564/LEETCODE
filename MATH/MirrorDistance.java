class Solution {
    public int mirrorDistance(int n) {
        int m=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return Math.abs(m-rev);

    }
}