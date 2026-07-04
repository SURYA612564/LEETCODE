class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i+1;j<n;j++)
            {
                sum=(nums[i]-1)*(nums[j]-1);
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}