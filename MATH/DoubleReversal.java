class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0;
        int ans=0;
        int res=num;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        while(rev>0)
        {
            int rem=rev%10;
            ans=ans*10+rem;
            rev/=10;
        }
        if(ans==res)
        return true;
        else return false;
    }
}