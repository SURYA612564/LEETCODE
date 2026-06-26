class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0,sum=0,tot=0;
        for(int i=0;i<k;i++)
        {
            tot+=arr[i];
            int res=tot/k;
            if(res>=threshold)
            {
                c=1;
            }
        }
        sum=tot;
        for(int i=k;i<arr.length;i++)
        {
            sum-=arr[i-k];
            sum+=arr[i];
            int res=sum/k;
            if(res>=threshold)
            {
                c++;
            }
        }
        return c;
    }
}