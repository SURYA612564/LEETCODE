import java.util.*;
public class main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String d=sc.next();
        double angle=0;
        if(d.equals("CW"))
        {
            angle=(b-a+360)%360;
        }
        else if(d.equals("CCW"))
        {
            angle=(a-b+360)%360;
        }
        double distance=(angle/360)*2*Math.PI*r;
        System.out.printf("%.2f",distance);
        
    }
}