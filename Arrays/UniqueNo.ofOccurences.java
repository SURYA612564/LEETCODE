class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x : arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int x : map.keySet())
        {
            set.add(map.get(x));
        }
        if(map.size()==set.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}