class Solution {
    public String reformatDate(String date) {
        String ans="";
        String[]parts=date.split(" ");
        ans+=parts[2]+"-";
        String months[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i=0;i<12;i++)
        {
            if(parts[1].equals(months[i]))
            {
                if(i<9)
                {
                    ans+="0"+(i+1)+"-";
                }
                else
                {
                    ans+=i+1+"-";
                }
            }
        }
        parts[0]=parts[0].replace("st","").replace("nd","").replace("rd","").replace("th","");
        if(parts[0].length()==1)
        ans+="0"+parts[0];
        else
        ans+=parts[0];
        return ans;
    }
}