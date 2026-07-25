class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans="";
        for(int i=0;i<words.size();i++)
        {
           char ch=words.get(i).charAt(0);
           ans+=ch;
        }
        if(ans.equals(s))return true;
        else return false;
    }
}