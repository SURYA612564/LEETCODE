class Solution {
    public int maximumCount(int[] nums) {
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                a++;
            }
            else if (nums[i]>0)
            {
                b++;
            }
            else
            {
                c++;
            }
        }
        return (Math.max(a,b));
    }
}