import java.util.Scanner;
public class primeRecursive
{
    public static void main(String[] args)
    {
        primeRec();
    }
    public static void primeRec()
    {
        int num;
        boolean check = false;
        Scanner tara = new Scanner(System.in);
        System.out.print("Enter a number for prime check:");
        num= tara.nextInt();

        for (int i = 2; i <= num / 2; ++i)
        {
            if (num%i==0)
            {
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        primeRec();
    }
}
