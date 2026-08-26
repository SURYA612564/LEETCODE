class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int upper=0,lower=0,number=0,special=0;
        if(password.length()<8)return false;
        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);
            if(i<password.length()-1)
            {
                char x=password.charAt(i+1);
                if(ch==x)
                return false;
            }
            if(ch>=65 && ch<=90)upper++;
            else if(ch>=97 && ch<=122)lower++;
            else if(ch>=48 && ch<=57)number++;
            else special++;
        }
        if(upper>=1 && lower>=1 && number>=1 && special>=1)return true;
        else return false;
    }
}