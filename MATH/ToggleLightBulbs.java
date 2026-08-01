class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer>list=new ArrayList<>();
        for(int x : bulbs)
        {
            if(list.contains(x))
            {
                list.remove(list.indexOf(x));
            }
            else
            {
                list.add(x);
            }
        }
        Collections.sort(list);
        return list;
    }
}