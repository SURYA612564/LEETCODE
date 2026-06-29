class Solution {
    public int searchInsert(int[] nums, int target) {
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==target)return i;
      }
      ArrayList<Integer>list=new ArrayList<>();
      for(int x : nums)list.add(x);
      list.add(target);
      Collections.sort(list);
      int k=0;
      int arr[]=new int[list.size()];
      for(int x : list)
      {
        arr[k]=x;
        k++;
      }
     for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==target)return i;
      }
       return -1;
    }
}