import java.util.Scanner;
public class leapYear
{
    public static void main(String[] args)  // input format control block can be added
    {
        Scanner tara = new Scanner(System.in);
        int yil;
        System.out.print("This algorithm finds if the given year is a leap year.\nEnter year:");
        yil = tara.nextInt();

        if (yil%4==0)
        {
            if (yil%100!=0)
                System.out.println("The year " + yil + " is a leap year.");

            else if ((yil%100==0) && (yil%400==0))
                System.out.println("The year " + yil + " is a leap year.");

            else
                System.out.println("The year " + yil + " is not a leap year.");
        }

        else
            System.out.println("The year " + yil + " is not a leap year.");
    }
}