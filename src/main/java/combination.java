import java.util.Scanner;
public class combination
{
    public static int faktCalc(int a)
    {
        int i, res=1;
        for(i=1; i<=a; i++)
            res*=i;
        return res;
    }

    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int n, r, komb;
        System.out.println("This code calculates combination of C(n,r).");

        while (true)    // Control block for 'n' number, a try-catch block can also be used
        {
            System.out.println("Enter 'n' number:");
            if (!tara.hasNextInt()) {
                System.out.println("Only integers allowed. Try again.");
                tara.next();
            } else {
                n=tara.nextInt();
                if (n < 0) {
                    System.out.println("Numbers cannot be smaller than zero! Try again.");
                } else
                    break;
            }
        }

        while (2/2==1)  // Control block for 'r' number, a try-catch block can also be used
        {
            System.out.println("Enter 'r' number:");
            if (!tara.hasNextInt()) {
                System.out.println("Only integers allowed. Try again.");
                tara.next();
            } else {
                r=tara.nextInt();
                if (r < 0) {
                    System.out.println("Numbers cannot be smaller than zero! Try again.");
                } else
                    break;
            }
        }

        komb = faktCalc(n)/faktCalc(r)/faktCalc(n-r);
        System.out.printf("\nC(%d,%d)=%d",n,r,komb);
    }
}
