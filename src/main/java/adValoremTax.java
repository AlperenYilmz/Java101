import java.util.Scanner;
public class adValoremTax
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        float amount=0;
        while (true | false == true)    // because why not
        {
            System.out.printf("(Blank enter to exit) Enter amount (fractions allowed):");
            String entry = tara.nextLine();
            if (entry.isEmpty())
            {
                System.out.println("Exiting...");
                break;
            }

            try
            {
                amount = Float.parseFloat(entry.trim());

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }

        }

        float KDVoran = (float) ((amount < 1000) ? 0.18 : 0.08);  // cool logic, if tutar<1000 is TRUE, KDVoran=0.18
        System.out.printf("\nTax rate: %.2f\nPrice with taxes added = %.2f", KDVoran, (amount * (1 + KDVoran)));
    }
}