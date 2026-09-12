class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
               min=Math.min(min,matrix[i][j]);
            }
            list1.add(min);
        }
        int j=0;
        while(j<matrix[0].length)
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++)
            {
              max=Math.max(matrix[i][j],max);
            }
            list2.add(max);
            j++;
        }
       if(matrix[0].length<2)return list2;
       if(matrix.length<2)return list1;
       list2.retainAll(list1);
       return list2;
    }
}