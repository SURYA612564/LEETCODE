class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list1.add(nums[i]);
        }
        for(int j=n;j<nums.length;j++)
        {
               list2.add(nums[j]);
        }
        int i=0,j=0;
        int arr[]=new int[nums.length];
        int k=0;
        while(i<n && j<n)
        {
        int ch=list1.get(i);
        arr[k]=ch;
        i++;
        k++;
        int x=list2.get(j);
        arr[k]=x;
        j++;
        k++;
        }
        return arr;
    }
}