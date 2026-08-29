class Solution {
    public boolean isCircularSentence(String sentence) {
        String[]words=sentence.split(" ");
        if(words.length==1)
        {
            return words[0].charAt(0)==words[0].charAt(words[0].length()-1);
        }
        for(int i=0;i<words.length-1;i++)
        {
            String str=words[i];
            String last=words[words.length-1];
            if(last.charAt(last.length()-1)!=words[0].charAt(0))return false;
            if(words[i].charAt(str.length()-1)!=words[i+1].charAt(0))return false;
        }
        return true;
    }
}