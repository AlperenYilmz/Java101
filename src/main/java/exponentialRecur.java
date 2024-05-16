import java.util.Scanner;
public class exponentialRecur   // might fail for inputs with decimal places
{
    public static void main(String[] args)
    {
        RecurUs();
    }

    static void RecurUs()
    {
        int base, baseTemp, to,res;
        Scanner tara = new Scanner(System.in);
        System.out.print("Enter base value:");
        base= tara.nextInt();
        baseTemp=base;
        System.out.print("Enter power value:");
        to=tara.nextInt();
        for(int i=1;i<to;i++)
            baseTemp*=base;
        System.out.println(base+" ^ "+to+" = "+baseTemp);
        RecurUs();
    }
}
