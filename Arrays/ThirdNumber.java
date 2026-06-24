class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer>set=new TreeSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        List<Integer>list=new ArrayList<>(set);
        int x=list.size();
        if(x>=3)
        return list.get(x-3);
        else
        {
            return list.get(x-1);
        }
    }
}