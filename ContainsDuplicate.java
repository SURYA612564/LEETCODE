class Solution {
    public boolean containsDuplicate(int[] nums) {
        int c=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int n=nums.length;
        int x=set.size();
        if(n==x)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
        