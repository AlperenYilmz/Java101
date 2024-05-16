import java.util.Scanner;
public class weirdAhProgram
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int i,j,k, gir;
        System.out.print("A cool program to create triangular pattern.\nEnter a positive integer:");
        gir = tara.nextInt();

        for(i=0;i<=gir;i++)
        {
            for (j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (k=((2*gir-1));k>=((2*i)+1);k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
