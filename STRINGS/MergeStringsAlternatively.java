class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String res="";
        while(i<=word1.length()-1 && j<=word2.length()-1)
        {
            char a=word1.charAt(i);
            char b=word2.charAt(j);
            res+=a;
            res+=b;
            i++;
            j++;
        }
        while(i<word1.length())
        {
            char y=word1.charAt(i);
            res+=y;
            i++;
        }
        while(j<word2.length())
        {
            char x=word2.charAt(j);
            res+=x;
            j++;
        }
        return res;
    }
}