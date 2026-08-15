class Solution {
    public boolean consecutiveSetBits(int n) {
        
        String binary=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<binary.length()-1;i++)
        {
            if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1')c++;
        }
        if(c==1)return true;
        else return false;
    }
}