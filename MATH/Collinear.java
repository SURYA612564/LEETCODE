import java.util.*;
public class main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        boolean collinear=true;
        for(int i=2;i<n;i++)
        {
            if((x[1]-x[0])*(y[i]-y[0])!=(y[1]-y[0])*(x[i]-x[0]))
            {
                collinear=false;
                break;
            }
        }
        if(collinear)
        {
            System.out.print("YES");
        }
        else
        {
          System.out.print("NO");   
        }
    }
}