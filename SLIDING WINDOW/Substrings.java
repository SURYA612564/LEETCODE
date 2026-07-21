class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)return 0;
        HashMap<Character,Integer>map=new HashMap<>();
        int c=0;
        for(int i=0;i<3;i++)
        {
           char ch=s.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size()==3)c++;
        for(int i=3;i<s.length();i++)
        {
            char ch=s.charAt(i-3);
            if(map.get(ch)==1)
            {
                map.remove(ch);
            }
            else
            {
                map.put(ch,map.get(ch)-1);
            }
            char x=s.charAt(i);
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.size()==3)c++;
        }
        return c;
    }
}