class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int ch=(int)s.charAt(i);
            int ch1=(int)s.charAt(i+1);
            int ans=Math.abs(ch1-ch);
            sum+=ans;
        }
        return sum;
    }
}