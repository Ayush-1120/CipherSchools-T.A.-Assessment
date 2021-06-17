import java.util.*;
public class second {
    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int p[]=new int[n];
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
        }
        int money=sc.nextInt();
        int robot=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(money%p[i]==0)
            {
                count++;
            }
        }
        if(count==robot)
        {
            System.out.println("right");
        }
        else
        System.out.println("wrong");
        
    }
}
