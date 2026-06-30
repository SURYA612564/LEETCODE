class Solution {
    public String restoreString(String s, int[] indices) {
        String ans="";
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
        for(char x : arr)
        {
            ans+=x;
        }
        return ans;
    }
}