class Solution {
    public boolean judgeSquareSum(int c) {
        long end=(long)Math.sqrt(c);
        long l=0,r=end;
        while(l<=r)
        {
            if((l*l) + (r*r) == c)
            {
                return true;
            }
            else if((l*l) + (r*r) < c)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return false;
    }
}