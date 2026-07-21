class Solution {
    public String truncateSentence(String s, int k) {
        String[]parts=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++)
        {
            if(i!=k-1)
             ans+=parts[i]+" ";
            else
            ans+=parts[i];
        }
        return ans;
    }
}