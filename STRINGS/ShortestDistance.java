class Solution {
    public int[] shortestToChar(String s, char c) {
        int res[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int min=Integer.MAX_VALUE;
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)==c)
                    {
                        min=Math.min(min,Math.abs(i-j));
                    }

                }
                res[i]=min;
            }
            return res;
    }
}