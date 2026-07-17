class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber>0)
        {
            columnNumber--;
            char ch=(char)('A'+(columnNumber%26));
            ans+=ch;
            columnNumber/=26;
        }
        String res="";
        for(int i=ans.length()-1;i>=0;i--)
        {
            res+=ans.charAt(i);
        }
        return res;
    }
}