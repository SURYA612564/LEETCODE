class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        String res="";
        for(int i=0;i<binary.length();i++)
        {
           char ch=binary.charAt(i);
           if(ch=='0')
           {
            res+='1';
           }
           else
           {
            res+='0';
           }
        }
        int ans=Integer.parseInt(res,2);
        return ans;
    }
}