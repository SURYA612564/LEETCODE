class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0,counter=0;
        int arr[]=new int[2];
        for(int i=0;i<events.length && counter<=9;i++)
        {
           if(events[i].equals("W"))
           {
            counter++;
           }
           else if(events[i].equals("WD") || events[i].equals("NB"))
           {
            score+=1;
           }
           else
           {
              int n=Integer.parseInt(events[i]);
              score+=n;
           }
        }
        arr[0]=score;
        arr[1]=counter;
        return arr;
    }
}