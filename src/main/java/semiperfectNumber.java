import java.util.Scanner;
public class semiperfectNumber
{
    public static void main(String[] args)      // can be improved for input format control
    {
        Scanner tara = new Scanner(System.in);
        int i=1, girdi, sum=0;
        System.out.print("""
                This code determines if the entered positive integer is a 'Semi-Perfect number'.
                A semi-perfect number is a number that is equal to sum of all its proper divisors.
                Now enter a positive integer to test:""");
        girdi= tara.nextInt();

        while(i<girdi)
        {
            if(girdi%i==0)
                sum+=i;
            i++;
        }

        System.out.print((sum==girdi) ? "Number you entered is a semi-perfect number.":"Number you entered is not a semi-perfect number.");
    }
}
