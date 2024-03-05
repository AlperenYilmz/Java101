public class forEach
{
    public static void main(String[] args)
    {
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};   //Different types of definition for arrays

        for (int score : scores)
        {
            System.out.print(score + "  ");
        }
    }
}