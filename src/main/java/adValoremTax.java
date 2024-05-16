import java.util.Scanner;
public class adValoremTax   // can be improved with try-catch number format exception
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        System.out.printf("Enter amount (fractions allowed):");
        double tutar = tara.nextDouble();

        double KDVoran = (tutar<1000) ? 0.18:0.08;  // cool logic

        System.out.printf("\nTax rate: %.2f\nPrice with taxes added = %.2f", KDVoran, (tutar*(1+KDVoran)));
    }
}
