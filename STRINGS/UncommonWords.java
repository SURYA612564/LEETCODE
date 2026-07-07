class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
        for(String x : s1.split(" "))
        {
           map.put(x,map.getOrDefault(x,0)+1);
        }
        for(String x : s2.split(" "))
        {
           map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<String>list=new ArrayList<>();
        int k=0;
        for(String key : map.keySet())
        {
            if(map.get(key)==1)
            {
                list.add(key);
            }
        }
        String [] res =new String[list.size()];
        for(String x : list)
        {
            res[k]=x;
            k++;
        }
        return res;
    }
}