class Solution {
    public int similarPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
           Set<Character>seti=new TreeSet<>();
            for(char x : words[i].toCharArray())
            {
                seti.add(x);
            }
            for(int j=i+1;j<words.length;j++)
            {
            Set<Character>setj=new TreeSet<>();
            for(char y : words[j].toCharArray())
            {
                setj.add(y);
            }
            if(seti.equals(setj))c++;
            }
        }
        return c;
    }
}