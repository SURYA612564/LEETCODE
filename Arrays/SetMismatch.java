class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int key : map.keySet())
        {
            if(map.get(key)==2)arr[0]=key;
        }
        int sum=0;
        for(int y : nums)
        {
            set.add(y);
        }
        for(int z : set)
        {
            sum+=z;
        }
        int total=nums.length*(nums.length+1)/2;
        arr[1]=total-sum;
        return arr;
    }
}