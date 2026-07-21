class Solution {
    public int divisorSubstrings(int num, int k) {
        String n=String.valueOf(num);
        int x=0,c=0,sum=0;
        for(int i=0;i<k;i++)
        {
            char ch=n.charAt(i);
            x=ch-'0';
            sum=sum*10+x;
        }
            if(sum!=0)
            {
        if(num%sum==0)c++;
            }
        for(int i=1;i<=n.length()-k;i++)
        {
        sum=0;
        for(int j=i;j<i+k;j++)
        {
            char y=n.charAt(j);
             x=y-'0';
             sum=sum*10+x;
        }
             if(sum!=0)
             {
             if(num%sum==0)c++;
             }
        }
        return c;
    }
}