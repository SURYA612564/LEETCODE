class Solution {
    public int minimumFlips(int n) {
        String bin=Integer.toBinaryString(n);
        String rev="";
        for(int i=bin.length()-1;i>=0;i--)
        {
            rev+=bin.charAt(i);
        }
        int c=0;
        for(int i=0;i<rev.length();i++)
        {
            if(rev.charAt(i)!=bin.charAt(i))c++;
        }
        return c;
    }
}