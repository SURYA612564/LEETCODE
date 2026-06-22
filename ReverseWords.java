class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String parts[]=s.split(" ");
        String rev="";
        for(int i=parts.length-1;i>=0;i--)
        {
            if(i!=0)
            {
              rev+=parts[i]+" ";
            }
            else
            {
                rev+=parts[i];
            }
        }
        return rev;
    }
}