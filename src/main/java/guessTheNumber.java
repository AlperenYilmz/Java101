import java.util.Random;
import java.util.Scanner;

public class guessTheNumber
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        Random rnd = new Random();
        int sayi= rnd.nextInt(100), hak=0, choice;
        System.out.println("The number is in between 0-100, and you have 5 shots.");

        while(hak<5)
        {
            System.out.printf("Make your guess (Remaining shots: %d):",5-hak);
            choice= tara.nextInt();
            if(choice<0 || choice>99)
            {
                System.out.println("You better try your shots in the range. Try again.");
                continue;
            }

            else
            {
                if(choice==sayi)
                {
                    System.out.println("Congrats! You guessed it right. Number was: "+sayi);
                    break;
                }

                else if(choice<sayi)
                    System.out.println("Go higher.");

                else
                    System.out.println("Go lower.");
            }
            hak++;

        }
        if(hak==5)
            System.out.println("You ran out of your chances. Number was: "+sayi+"");
    }
}
