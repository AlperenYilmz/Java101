import java.util.Scanner;
public class patternRecursive
{
    public static void main(String[] args)
    {
        int num;
        Scanner tara = new Scanner(System.in);
        System.out.print("Type an integer:");
        num= tara.nextInt();
        if(num<1)
        {
            System.out.println("You should at least type in '1' to create a pattern.");
            main(null);
        }
        else
            desen(num, num, true);
    }

    public static void desen(int a, int b, boolean check)
    {
        int stat;
        System.out.print(b+"  ");
        if(b<1)
            check=false;
        stat=check ? (b-5):(b+5);
        if(stat<=a)
            desen(a,stat,check);
    }
}
