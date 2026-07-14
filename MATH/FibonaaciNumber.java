class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int t1=0,t2=1,t3,sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=2;i<n;i++)
        {
            t3=t1+t2;
            list.add(t3);
            t1=t2;
            t2=t3;
        }
        
            sum=sum+list.get(n-1);
            sum=sum+list.get(n-2);
        return sum;
    }
}