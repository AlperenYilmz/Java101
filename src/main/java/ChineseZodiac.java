import java.util.Scanner;

public class ChineseZodiac
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int yil, kalan;
        System.out.println("This program finds your Chinese Zodiac sign based on your birth year.");
        System.out.print("Type your birth year:");
        yil = tara.nextInt();
        kalan = yil%12;

        switch (kalan)
        {
            case 0:
                System.out.print("Your sign is: Monkey");
                break;
            case 1:
                System.out.print("Your sign is: Rooster");
                break;
            case 2:
                System.out.print("Your sign is: Dog");
                break;
            case 3:
                System.out.print("Your sign is: Pig");
                break;
            case 4:
                System.out.print("Your sign is: Rat");
                break;
            case 5:
                System.out.print("Your sign is: Ox");
                break;
            case 6:
                System.out.print("Your sign is: Tiger");
                break;
            case 7:
                System.out.print("Your sign is: Rabbit");
                break;
            case 8:
                System.out.print("Your sign is: Dragon");
                break;
            case 9:
                System.out.print("Your sign is: Snake");
                break;
            case 10:
                System.out.print("Your sign is: Horse");
                break;
            default:
                System.out.print("Your sign is: Sheep");
        }
    }
}
