class Solution {
    public int maxVowels(String s, int k) {
        int c=0,max=0;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                c++;
            }
        }
        max=c;
        for(int i=k;i<s.length();i++)
        {
            char ch=s.charAt(i-k);
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')c--;
             char ch1=s.charAt(i);
             if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')c++;
             max=Math.max(c,max);
        }
        return max;
    }
}