class Solution {
    public int countAsterisks(String s) {
        String[]parts=s.split("\\|");
        int c=0;
        for(int i=0;i<parts.length;i+=2)
        {
           for(int j=0;j<parts[i].length();j++)
           {
             if(parts[i].charAt(j)=='*')c++;
           }
        }
        return c;
    }
}