import java.util.regex.*;
class Solution {
    public int secondHighest(String s) {
        Pattern p=Pattern.compile("(\\d)");
        Matcher m= p.matcher(s);
        HashSet<Integer>set=new HashSet<>();
        while(m.find())
        {
            int y=Integer.parseInt(m.group(1));
            set.add(y);
        }
        List<Integer>list=new ArrayList<>();
        if(set.size()<2)return -1;
        else 
        {
            for(int x : set)
            {
                list.add(x);
            }
        }
        return list.get(list.size()-2);
    }
}