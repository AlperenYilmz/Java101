public class patternCreator
{
    public static void main(String[] args)
    {
        String[][] BHarf = new String[7][4];
        System.out.println();
        for (int i=0;i<BHarf.length;i++)
        {
            for (int j=0;j<BHarf[i].length;j++)
            {
                if (i==0 || i==3 || i==6)
                    BHarf[i][j] = " * ";
                else if (j==0 || j==3)
                    BHarf[i][j] = " * ";
                else
                    BHarf[i][j] = "   ";
            }
        }

        for (String[] row : BHarf)
        {
            for (String col : row)
                System.out.print(col);
            System.out.println();
        }
    }
}
