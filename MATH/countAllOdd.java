class Solution {
    public int countOdds(int low, int high) {
      int nums=(high-low)+1;
      if(low%2==1 && high%2==1)
      {
        return (nums/2)+1;
      }
      else
      return nums/2;
    }
}