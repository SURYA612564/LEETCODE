class Solution {
    public boolean judgeCircle(String moves) {
        int a=0,b=0,c=0,d=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='L')
            {
                a++;
            }
            else if(ch=='U')
            {
                b++;
            }
            else if(ch=='D')
            {
                c++;
            }
            else if(ch=='R')
            {
                d++;
            }
        }
        if(a==d && b==c)
        {
            return true;
        }
        else
        return false;
    }
}