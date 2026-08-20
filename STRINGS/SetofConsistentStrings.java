class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character>set=new HashSet<>();
        for(char c : allowed.toCharArray())
        {
           set.add(c);
        }
        int c=0;
        for(String x  : words)
        {
         Set<Character>set2=new HashSet<>();
            for(char ch : x.toCharArray())
            {
                set2.add(ch);
            }
            if(set.containsAll(set2))c++;
        }
        return c;
    }
}