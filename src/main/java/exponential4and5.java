import java.util.Scanner;
public class exponential4and5
{
    public static void main(String[] args)      // can be improved for integer inputs with "hasNextInt" method under a while loop
    {
        Scanner tara = new Scanner(System.in);
        float gir;
        System.out.print("This code finds the powers of 4 and 5 up to the number you type in.\nNow enter a positive number:");
        gir= tara.nextInt();

        System.out.print("Factors of 4:");
        for(int a=1; a<gir; a=a*4)
            System.out.printf("%d, ", a);

        System.out.print("\nFactors of 5:");
        for(int b=1; b<gir; b=b*5)
            System.out.printf("%d, ", b);
    }
}
