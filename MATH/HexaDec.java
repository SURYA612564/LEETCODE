class Solution {
    public String concatHex36(int n) {
        int x=n*n;
        String s1=Integer.toHexString(x);
        s1=s1.toUpperCase();
        int y=n*n*n;
        String s2=Integer.toString(y,36);
        s2=s2.toUpperCase();
        String ans=s1+s2;
        return ans;
    }
}