class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int res=Integer.bitCount(ans);
        return res;
    }
}