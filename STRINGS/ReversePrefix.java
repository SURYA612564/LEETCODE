class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                index=i;
                break;
            }
        }
       System.out.print(index);
        String ans="";
        for(int i=index;i>=0;i--)
        {
            ans+=word.charAt(i);
        }
        ans=ans+word.substring(index+1);
        if(index==-1)return word;
        else
        return ans;
    }
}