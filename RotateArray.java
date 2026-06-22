class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:nums)
        {
            list.add(x);
        }
        Collections.rotate(list,k);
        int i=0;
        for(int y: list)
        {
            nums[i]=y;
            i++;
        }
    }
}