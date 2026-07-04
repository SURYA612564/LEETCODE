class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }for(int key : map.keySet())
        {
            if(map.get(key)==1)sum+=key;
        }
        return sum;
    }
}