import java.util.Scanner;
public class zodiac
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        String month;
        int day;

        System.out.println("This code finds your zodiac sign.");

        System.out.print("Type your birth month (ex. november):");
        month = tara.next();

        System.out.print("Type your birthday as number:");
        day = tara.nextInt();


        if(month.compareToIgnoreCase("april")==0)
        {
            if (day>=1 && day<=20)
                System.out.print("Your sign is: Aries");
            else if(day>20 && day<=31)
                System.out.print("Your sign is: Taurus");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("may")==0)
        {
            if (day>=1 && day<=21)
                System.out.print("Your sign is: Taurus");
            else if(day>21 && day<=31)
                System.out.print("Your sign is: Gemini");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("june")==0)
        {
            if (day>=1 && day<=22)
                System.out.print("Your sign is: Gemini");
            else if(day>22 && day<=31)
                System.out.print("Your sign is: Cancer");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("july")==0)
        {
            if(day>=1 && day<=22)
                System.out.print("Your sign is: Cancer");
            else if(day>22 && day<=31)
                System.out.print("Your sign is: Leo");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("august")==0)
        {
            if(day>=1 && day<=22)
                System.out.print("Your sign is: Leo");
            else if(day>22 && day<=31)
                System.out.print("Your sign is: Virgo");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("september")==0)
        {
            if(day>=1 && day<=22)
                System.out.print("Your sign is: Virgo");
            else if(day>22 && day<=31)
                System.out.print("Your sign is: Libra");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("october")==0)
        {
            if(day>=1 && day<=22)
                System.out.print("Your sign is: Libra");
            else if(day>22 && day<=31)
                System.out.print("Your sign is: Scorpio");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("november")==0)
        {
            if(day>=1 && day<=21)
                System.out.print("Your sign is: Scorpio");
            else if(day>21 && day<=31)
                System.out.print("Your sign is: Sagittarius");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("december")==0)
        {
            if(day>=1 && day<=21)
                System.out.print("Your sign is: Sagittarius");
            else if(day>21 && day<=31)
                System.out.print("Your sign is: Capricorn");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("january")==0)
        {
            if(day>=1 && day<=21)
                System.out.print("Your sign is: Capricorn");
            else if(day>21 && day<=31)
                System.out.print("Your sign is: Aquarius");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("february")==0)
        {
            if(day>=1 && day<=19)
                System.out.print("Your sign is: Aquarius");
            else if(day>19 && day<=31)
                System.out.print("Your sign is: Pisces");
            else
                System.out.print("Something went wrong :(");
        }

        else if(month.compareToIgnoreCase("march")==0)
        {
            if(day>=1 && day<=20)
                System.out.print("Your sign is: Pisces");
            else if(day>20 && day<=31)
                System.out.print("Your sign is: Aries");
            else
                System.out.print("Something went wrong :(");
        }

        else
            System.out.print("\nSomething went wrong :(");
    }
}
