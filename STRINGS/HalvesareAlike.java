class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        int count1=0,count2=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
               ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')count1++;
        }
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
               ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')count2++;
        }
        return count1==count2;
    }
}