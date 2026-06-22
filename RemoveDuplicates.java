class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new LinkedHashSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=0;
        }
        int k=0;
        for(int y: set)
        {

            nums[k]=y;
            k++;
        }
        return set.size();
    }
}