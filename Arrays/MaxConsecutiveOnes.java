class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            
                if(nums[i]==1)
                {
                    c++;
                }
                if(c>max)
                {
                    max=c;
                }
                else if(nums[i]==0)
                {
                    c=0;
                }
            
        }
        return max;
    }
}