import java.util.Scanner;
public class BMIcalculator
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);

        double boy, kilo, index;

        System.out.print("Enter your height in meters: (ex. 1.72)");
        boy = tara.nextDouble();

        System.out.println("Enter your weight in kilograms:");
        kilo = tara.nextDouble();

        index = kilo/(boy*boy);

        System.out.printf("\nYour BMI: %.2f", index);

        if (index<29.9 && index>25)
        {
            System.out.println("\nYou're overweight.");
        }

        else if (index>=30 && index<35)
        {
            System.out.println("\nYou're at level 1 obesity.");
        }

        else if (index>35 && index<45)
        {
            System.out.println("\nYou're at level 2 obesity.");
        }

        else if (index>=45)
        {
            System.out.println("Welcome to the 'My 600-lb Life' with Dr. Nowzaradan");
        }

        else if (index<=25 && index>18.4)
        {
            System.out.println("\nYou're normal.");
        }

        else
        {
            System.out.println("\nYou're anorectic.");
        }

    }
}
