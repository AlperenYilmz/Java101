import java.util.Scanner;
public class biggestSmallest
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int i=1, cnt=0;
        float enk=0, enb=0, tempNum=0;
        System.out.println("This code finds the biggest and smallest number among your sequential inputs.");

        while (true)
        {
            System.out.printf("Enter %d. number:", i);
            String girdi = tara.nextLine();

            if(girdi.isEmpty())
            {
                System.out.println("Exiting...");
                break;
            }

            try
            {
                tempNum=Float.parseFloat(girdi.trim());
                if (tempNum<=enk)
                    enk=tempNum;
                else if (tempNum>=enb)
                    enb=tempNum;
                i++;
                cnt++;

            }catch (NumberFormatException e)
            {
                System.out.println("Invalid input! Please enter a valid number.");
            }

        }












        /*
        while (true) // control loop without creating an array
        {
            System.out.printf("Enter the %d. number (Press ENTER to exit anytime):", i);
            if (tara.hasNextFloat())
            {
                girdi= tara.nextFloat();
                tara.nextLine();
                if (girdi<=enk)
                    enk=girdi;
                else if (girdi>=enb)
                    enb=girdi;
                i++;
            }
            else
            {
                String input = tara.nextLine();
                if (input.isEmpty())
                    break;
                else
                    System.out.println("Invalid input! Please enter an integer value.");
            }
        }
        */
        if(cnt==0)
            System.out.print("No entries were made...");
        else if (cnt==1)
            System.out.printf("Only one entry made, and that is: %.4f", tempNum);

        else
        {
            System.out.printf("Biggest number: %f", enb);
            System.out.printf("\nSmallest number: %f", enk);
        }

    }
}
