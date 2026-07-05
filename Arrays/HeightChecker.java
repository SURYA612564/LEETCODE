class Solution {
    public int heightChecker(int[] heights) {
        int k=0;
        int expected[]=new int[heights.length];
        for(int x : heights)
        {
           expected[k]=x;
           k++;
        }
        Arrays.sort(expected);
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expected[i])
            {
                c++;
            }
        }
        return c;
    }
}