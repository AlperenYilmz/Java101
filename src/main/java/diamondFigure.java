import java.util.Scanner;
public class diamondFigure
{
    public static void main(String[] args)
    {
        int gir, i, j, k;
        Scanner tara = new Scanner(System.in);
        System.out.print("Put an integer:");
        gir = tara.nextInt();

        for(i=1;i<=gir;i++)
        {
            for(j=1;j<=(gir-i);j++)
            {
                System.out.print(" ");
            }

            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=1;i<=gir;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (k=((2*gir)-1);k>=((2*i)+1);k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
