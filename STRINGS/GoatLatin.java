class Solution {
    public String toGoatLatin(String sentence) {
        String[]parts=sentence.split(" ");
        String vowels="aeiouAEIOU";
        String res="";
        for(int i=0;i<parts.length;i++)
        {
            char ch=parts[i].charAt(0);
            if(vowels.indexOf(ch)!=-1)
            {
                res+=parts[i];
                res+="ma";
            }
            else
            {
                 res+=parts[i].substring(1)+parts[i].charAt(0)+"ma";
            }
            for(int j=0;j<=i;j++)
                res+="a";
        
            if(i!=parts.length-1)
            {
                res+=" ";
            }
        }
        return res;
    }
}