class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int i=0;
        for(int key : map.keySet())
        {
            if(map.get(key)==2)
            {
                arr[i]=key;
                i++;
            }
        }
        return arr;
    }
}