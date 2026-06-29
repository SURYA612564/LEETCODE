class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int arr[]=new int[candies.length];
        ArrayList<Boolean>list=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            arr[i]=candies[i]+extraCandies;
        }
        for(int i=0;i<candies.length;i++)
        {
            int c=0;
            for(int j=0;j<candies.length;j++)
            {
            if(arr[i]>=candies[j])c++;
            }
            if(c==candies.length)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}