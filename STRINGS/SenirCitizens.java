class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++)
        {
        String age=details[i].substring(11,13);
        int val=Integer.parseInt(age);
        if(val>60)c++;
        }
        return c;
    }
}