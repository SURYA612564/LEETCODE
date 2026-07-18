class Solution {
    public int maxDistance(int[] colors) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<colors.length;i++)
        {
            for(int j=i+1;j<colors.length;j++)
            {
                if(colors[i]!=colors[j])
                {
                    index=Math.abs(i-j);
                }
            }
            max=Math.max(index,max);
        }
        return max;
    }
}