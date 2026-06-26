class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0,min=0;
        for(int i=0;i<k;i++)
        {
            char ch=blocks.charAt(i);
            if(ch=='W')
            {
                c++;
            }
        }
        min=c;
        for(int i=k;i<blocks.length();i++)
        {
            char ch=blocks.charAt(i-k);
            if(ch=='W')
            {
                c--;
            }
            char x=blocks.charAt(i);
            if(x=='W')
            {
                c++;
            }
            min=Math.min(min,c);
        }
        return min;
    }
}