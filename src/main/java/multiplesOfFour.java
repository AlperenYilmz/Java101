import java.util.Scanner;
public class multiplesOfFour
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int gir, sum=0;
        System.out.println("This code sums all the numbers you enter that are multiples of 4, until an odd number is entered.");
        do
        {
            System.out.print("Enter a number:");
            gir= tara.nextInt();
            if(gir%4==0)
                sum+=gir;
        }
        while (gir%2==0);

        System.out.print("Sum:" +sum);
    }
}
