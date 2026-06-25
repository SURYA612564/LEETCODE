class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int x: nums1)
        {
            set1.add(x);
        }
        for(int y: nums2)
        {
            set2.add(y);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:set1)
        {
            for(int y:set2)
            {
                if(x==y)
                {
                    list.add(x);
                }
            }
        }
        int arr[]=new int[list.size()];
        int k=0;
        for(int s:list)
        {
            arr[k]=s;
        k++;
        }
        return arr;
    }
}