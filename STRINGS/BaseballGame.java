class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            String str=operations[i];
            if(str.equals("C"))
            {
                s.pop();
            }
            else if(str.equals("D"))
            {
                s.add(s.peek()*2);
            }
            else if(str.equals("+"))
            {
               int sum=0;
               for(int j=s.size()-1;j>=s.size()-2;j--)
               {
                 sum+=s.get(j);
               }
               s.add(sum);
            }
            else
            {
                s.add(Integer.parseInt(str));
            }
        }
        int res=0;
        for(int x : s)
        {
            res+=x;
        }
        return res;
    }
}