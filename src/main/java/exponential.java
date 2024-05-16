import java.util.Scanner;
public class exponential
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        float m, n, i, sonuc=1;
        System.out.print("This code calculates the exponential value of m^n.\nNow enter base 'm':");
        m = tara.nextFloat();
        System.out.print("Enter power 'n':");
        n = tara.nextFloat();

        for(i=1;i<=n;i++)
            sonuc*=m;

        System.out.printf("%.3f%n^%.3f%n equals to: %f%n", m, n, sonuc);
    }
}
