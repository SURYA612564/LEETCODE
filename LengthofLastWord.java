class Solution {
    public int lengthOfLastWord(String s) {
        String []parts=s.split(" ");
        //for(int i=0;i<parts.length;i++)
        int x=parts[parts.length-1].length();
        return x;
    }
}