import java.util.*;
public class main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replace("cd ","");
        String[]parts=str.split("/");
        Stack<String>s=new Stack<>();
        for(int i=0;i<parts.length;i++)
        {
           if(parts[i].equals(".."))
           {
               if(!s.isEmpty())
               {
                   s.pop();
               }
           }
           else
           {
               s.push(parts[i]);
           }
        }
        for(int i=0;i<s.size();i++)
        {
            if(i!=s.size()-1)
            System.out.print(s.get(i)+"/");
            else
            System.out.print(s.get(i));
            
        }
        
    }
}