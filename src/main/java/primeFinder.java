import java.util.Scanner;
public class primeFinder
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int girdi;
        System.out.print("This algorithm finds all prime numbers up to the number you enter.\nNow enter a positive integer:");
        girdi=tara.nextInt();

        for(int i=2; i<=girdi; i++)
        {
            int ct=0;
            for(int k=1; k<i; k++)
            {
                if(i%k==0)
                    ct++;
            }
            if(ct<=1)
                System.out.printf("%d\n", i);
        }
    }
}
