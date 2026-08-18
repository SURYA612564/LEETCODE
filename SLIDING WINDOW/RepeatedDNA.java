class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String>seen=new HashSet<>();
        Set<String>repeated=new LinkedHashSet<>();
        List<String>list=new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String str=s.substring(i,i+10);
            if(!seen.add(str))
            {
                repeated.add(str);
            }
        }
        for(String y : repeated)
        {
            list.add(y);
        }
        return list;
    }
}