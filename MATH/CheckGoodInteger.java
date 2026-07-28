class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0,squ=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            squ+=rem*rem;
            n/=10;
        }
        if(squ-sum>=50)return true;
        else return false;
    }
}