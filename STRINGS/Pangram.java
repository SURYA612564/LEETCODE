class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)return false;
       String check="abcdefghijklmnopqrstuvwxyz";
       List<Character>list1=new ArrayList<>();
       List<Character>list2=new ArrayList<>();
       for(char c : check.toCharArray())
       {
        list1.add(c);
       }
       for(char c : sentence.toCharArray())
       {
        list2.add(c);
       }
       return list2.containsAll(list1);

       
    }
}