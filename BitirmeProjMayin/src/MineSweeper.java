import java.util.*;

public class MineSweeper
{

    char[][] matrix;
    String[][] FieldVar;

    public void Build(int line, int column)
    {
        this.matrix = new char[line][column];
        this.FieldVar = new String[line][column];

        for (int i=0;i<line;i++)
        {
            for (int j=0;j<column;j++)
            {
                this.matrix[i][j]='-';
                this.FieldVar[i][j]="-";
            }
        }
    }

    public void Minefy(int row, int column)
    {
        int mineCnt = (int)((row*column)/4);

        for (int i=0;i<mineCnt;i++)
        {
            int randR=(int)(Math.random()*row);
            int randC=(int)(Math.random()*column);
            if (this.matrix[randR][randC]=='*')
                mineCnt++;

            else
                this.matrix[randR][randC]='*';
        }
    }

    public void Display(int row, int column)
    {
        System.out.println("Mayinlarin Haritasi");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.print("\n");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void Run()
    {
        Scanner tara = new Scanner(System.in);
        System.out.print("Lutfen satir sayisini giriniz:");
        int row = tara.nextInt();
        System.out.print("Lutfen sutun sayisini giriniz:");
        int col = tara.nextInt();

        Build(row,col);
        Minefy(row,col);
        Display(row,col);

        int loopCnt=(row*col)-(int)((row*col)/4);
        System.out.println("Oyuna Hosgeldiniz.");

        while (loopCnt>0)
        {
            for (int i=0;i<row;i++)
            {
                for (int j=0;j<col;j++)
                    System.out.print(this.FieldVar[i][j]+" ");
                System.out.print("\n");
            }
            int sum = 0;
            System.out.print("Denemek istediginiz satiri giriniz:");
            int r1 = (tara.nextInt())-1;
            System.out.print("Denemek istediginiz sutunu giriniz:");
            int c2 = (tara.nextInt())-1;
            if (row>=r1 && col>=c2 && r1>= 0 && c2>= 0)
            {
                if (matrix[r1][c2] == '*')
                {
                    System.out.println("Mayina bastiniz! Oyun sona erdi!");
                    break;
                }

                else
                {
                    if ((r1-1)>=0 && (c2-1)>=0)
                        if (matrix[r1-1][c2-1] == '*')
                            sum++;

                    if ((r1-1)>=0)
                        if (matrix[r1-1][c2] == '*')
                            sum++;

                    if ((r1-1)>=0 && (c2+1)<col)
                        if (matrix[r1-1][c2+1] == '*')
                            sum++;

                    if ((c2-1)>=0)
                        if (matrix[r1][c2-1] == '*')
                            sum++;

                    if ((c2+1)<col)
                        if (matrix[r1][c2+1] == '*')
                            sum++;

                    if ((r1+1)<row && (c2-1)>=0)
                        if (matrix[r1+1][c2-1] == '*')
                            sum++;

                    if ((r1+1)<row)
                        if (matrix[r1 + 1][c2] == '*')
                            sum++;

                    if ((r1+1)<row && (c2+1)<col)
                        if (matrix[r1+1][c2+1] == '*')
                            sum++;

                    this.FieldVar[r1][c2] = String.valueOf(sum);
                }
            }

            else
                System.out.println("Hatali giris.");

            System.out.println("|||||||||||||||||||||||||||||||||||||||");
            loopCnt--;

            if (loopCnt==0)
            {
                System.out.println("Kazandiniz! Tebrikler!");

                for (int i=0;i<row;i++)
                {
                    for (int j=0;j<col;j++)
                        System.out.print(FieldVar[i][j]+" ");
                    System.out.print("\n");
                }

            }
        }


    }
}