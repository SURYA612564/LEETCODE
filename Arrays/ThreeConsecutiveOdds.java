class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]%2!=0 && arr[j]%2!=0 && arr[k]%2!=0)
                    {
                        if(i+1==j & j+1==k)
                        return true;
                    }
                }
            }
        }
        return false;
    }
}