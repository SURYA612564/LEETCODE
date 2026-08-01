class Solution {
    public int vowelConsonantScore(String s) {
        int vowels=0,conso=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
             vowels++;
            }
            else if(ch>=98 && ch<=122 && ch!=101 && ch!=105 && ch!=111 && ch!=117)
            {
                conso++;
            }
        }
        int ans=0;
        if(conso>0)
        {
             ans=vowels/conso;
        }
        return ans;
    }
}
