class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        String res="";
        while(i<s.length() && j<t.length())
        {
            char a=s.charAt(i);
            char b=t.charAt(j);
            if(a==b)
            {
               res+=b;
            
            i++;
            j++;
            }
            else
            {
                j++;
            }
        }
        if(res.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}