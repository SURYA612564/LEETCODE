class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int t=Math.min(a,b);
        while(t>=1)
        {
            if( a % t ==0 && b %t==0)
            {
                return t;
            }
            else
            {
                t=t-1;
            }
        }
        return -1;
    }
}