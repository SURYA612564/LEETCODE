class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>map1=new HashMap<>();
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Map<Character,Integer>map2=new HashMap<>();

            for(char x : arr1)
            {
                map1.put(x,map1.getOrDefault(x,0)+1);
            }
            for(char x : arr2)
            {
                map2.put(x,map2.getOrDefault(x,0)+1);
            }
        return map1.equals(map2);
    }
}