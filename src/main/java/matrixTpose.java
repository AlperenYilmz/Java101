import java.util.Scanner;
public class matrixTpose
{
    public static void main(String[] args)
    {
        int r, c;
        Scanner tara = new Scanner(System.in);
        System.out.println("This code transposes the matrix you define.");
        System.out.print("Enter row size 'a' for matrix [a][b]:");
        r= tara.nextInt();
        System.out.print("Enter column size 'b' for matrix [a][b]:");
        c= tara.nextInt();
        int[][] matris = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("Enter %d. row %d. column element:",i+1,j+1);
                matris[i][j]= tara.nextInt();
            }
        }

        System.out.println("Your matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transposed:");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(matris[j][i]+" ");
            }
            System.out.println();
        }
    }
}
