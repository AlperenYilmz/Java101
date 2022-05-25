import java.util.*;

public class matrixTpose
{
    public static void main(String[] args)
    {
        int r, c;
        Scanner tara = new Scanner(System.in);
        System.out.print("Matrisin ([a][b]) satir boyutunu giriniz (a):");
        r= tara.nextInt();
        System.out.print("Matrisin ([a][b]) sutun boyutunu giriniz (b):");
        c= tara.nextInt();
        int[][] matris = new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.printf("%d. satir %d. sutun elementini giriniz:",i+1,j+1);
                matris[i][j]= tara.nextInt();
            }
        }

        System.out.println("Girilen 2 boyutlu dizi:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpoze edilen 2 boyutlu dizi:");
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
