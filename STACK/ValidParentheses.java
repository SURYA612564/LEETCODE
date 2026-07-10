class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        boolean balanced=true;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else 
            {
                if(st.isEmpty())
                {
                    balanced=false;
                    break;
                }
                char top=st.pop();
                if((ch==')' && top!='(') || 
                   (ch=='}' && top!='{') || 
                   (ch==']' && top!='['))
                   {
                    balanced=false;
                    break;
                   }
            }
        }
            if(!st.isEmpty())
            {
                balanced=false;
            }
            if(balanced)return true;
            else
            return false;
    }
}