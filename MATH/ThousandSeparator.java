class Solution {
    public String thousandSeparator(int n) {
        String val=Integer.toString(n);
        String ans="";
        for(int i=0;i<val.length();i++)
        {
            if(i>0 && (val.length()-i)%3==0)
            {
                ans+=".";
            }
            ans+=val.charAt(i);
        }
        return ans;
    }
}