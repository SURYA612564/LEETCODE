class Solution {
    public boolean isFascinating(int n) {
        int twice=2*n;
        int thrice=3*n;
        String ans=String.valueOf(n)+String.valueOf(twice)+String.valueOf(thrice);
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<ans.length();i++)
        {
            if(ans.charAt(i)!='0')
            set.add(ans.charAt(i));
        }

        if(set.size()==9 && ans.length()==9)
        {
            return true;
        }
        return false;
    }
}