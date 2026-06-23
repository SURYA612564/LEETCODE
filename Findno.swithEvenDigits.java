class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            String n=String.valueOf(nums[i]);
            int len=n.length();
            if(len%2==0)
            {
                c++;
            }
        }
        return c;
    }
}