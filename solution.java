import java.util.Scanner;

public class solution {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Myclass arr[] = new Myclass[5];
        for(int i=0;i<5;i++)
        {
            int value=sc.nextInt();sc.nextLine();
        }
        int l1=sc.nextInt();sc.nextLine();
        int l2=sc.nextInt();sc.nextLine();

        int avg=average(l1,l2);
        System.out.println(avg);
    }
    public static int average(int l3,int l4)
    {

        int sum=0;
        int c=0;
        for(int i = l3;i<=l4;i++)
        {
            sum=sum+i;
            c++;
        }
        int avg=sum/c;
        return avg;
    }

}
class Myclass
{
    int value;
}
