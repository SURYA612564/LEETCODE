class Solution {
    public int sumBase(int n, int k) {
        String str=Integer.toString(n,k);
        int x=Integer.parseInt(str);
        int sum=0;
        while(x>0)
        {
            int rem=x%10;
            sum+=rem;
            x=x/10;
        }
        return sum;
        
    }
}