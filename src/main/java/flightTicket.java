import java.util.Scanner;
public class flightTicket
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int age, type;
        float dist;
        double price=0;

        System.out.println("This is a small program for calculating ticket price depending on some parameters.");

        while (true)
        {
            System.out.print("Age:");
            age = tara.nextInt();
            if (age<1)
                System.out.println("Invalid entry! Try again.\n");
            else
                break;
        }



        while (true)
        {
            System.out.print("Specify the distance as kilometers: (ex. 560,45):");
            dist = tara.nextFloat();
            if (dist<1)
                System.out.println("Invalid entry! Try again.\n");
            else
                break;
        }

        while (true)
        {
            System.out.print("Define ticket type (1. One Way, 2. Round Trip):");
            type = tara.nextInt();
            if(type!=2 && type!=1)
                System.out.println("Invalid entry! Try again.\n");
            else break;
        }


        if(type==1)
        {
            if(age<=12 && age>=0)
                price = (dist*0.1/2);

            else if(age>12 && age<=24)
                price = (dist*0.1*9/10);

            else if(age>=65)
                price = (dist*0.1*7/10);

            else
                price = (dist*0.1);
        }

        else
        {
            if(age<=12)
                price = (dist*0.1/2*4/5*2);

            else if(age>12 && age<=24)
                price = (dist*0.1*9/10*4/5*2);

            else if(age>=65)
                price = (dist*0.1*7/10*4*2/5);

            else
                price = (dist*0.1*4*2/5);
        }

        System.out.printf("Ticket price:%.2f TL",price);
    }
}
