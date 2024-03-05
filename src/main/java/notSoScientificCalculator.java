import java.util.*;

public class notSoScientificCalculator
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int op, n1, n2;
        System.out.print("This is a scientific calculator.\nMenu:\n" +
                "1- Addition & Subtraction\n2- Multiplication\n3- Division\n4- Exponential\n5- Factorial\n6- Mod\n7- Rectangular area and periphery \n0- Exit\n");

        do
        {
            System.out.print("Choose an operation:");
            op = tara.nextInt();
            switch (op)
            {
                case 1:
                    sumAndSub();
                    break;
                case 2:
                    mux();
                    break;
                case 3:
                    div();
                    break;
                case 4:
                    pow();
                    break;
                case 5:
                    fact();
                    break;
                case 6:
                    mod();
                    break;
                case 7:
                    rect();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid entry, try again.");
            }
        }while (op!=0);
    }

    static void sumAndSub() // For this method, try-catch block can be used for sequential inputs, refer to my "biggestSmallest" file
    {
        int cnt;
        float temp, sum=0;
        Scanner tara = new Scanner(System.in);
        System.out.print("# of numbers to add and/or subtract (for subtraction, enter the number as '-n'):");
        cnt= tara.nextInt();
        for (int i=1; i<=cnt; i++)
        {
            System.out.printf("Enter %d. number:", i);
            temp = tara.nextFloat();
            sum+=temp;
        }
        System.out.println("Ans  = " +sum);
    }

    static void mux()
    {
        int cnt,sum=1;
        float temp;
        Scanner tara = new Scanner(System.in);
        System.out.println("# of the numbers to multiply:");
        cnt= tara.nextInt();
        for(int i=1; i<=cnt; i++)
        {
            System.out.printf("Enter the %d. number:", i);
            temp= tara.nextFloat();
            sum*=temp;
        }
        System.out.println("Sonuc="+sum);
    }

    static void div()
    {
        Scanner tara = new Scanner(System.in);
        int cnt;
        float num, res = 0.0F;
        System.out.println("# of the numbers to divide the first number:");
        cnt = tara.nextInt();

        for (int i=1; i<=cnt; i++)  // division works a bit wonky
        {
            System.out.print(i + ". number:");
            num = tara.nextFloat();
            if (i!=1 && num==0)
            {
                System.out.println("Divide by zero!!.");    // also, divide by zero exception can be used here
                continue;
            }
            res/=num;
        }
        System.out.println("Sonuc: " +res);
    }

    static void pow()
    {
        float base, baseTemp, deg;
        Scanner tara = new Scanner(System.in);
        System.out.print("For the operation a^b, enter number 'a':");
        base= tara.nextFloat();
        baseTemp=base;
        System.out.print("Enter number 'b':");
        deg= tara.nextFloat();
        for(int i=1;i<deg;i++)
            baseTemp*=base;
        System.out.println(base+" ^ "+deg+" = "+baseTemp);
    }

    static void fact()
    {
        int res=1, num;
        Scanner tara = new Scanner(System.in);
        System.out.print("Put the 'n' number to calculate n! :");
        num=tara.nextInt();

        for(int i=1;i<=num;i++)
            res*=i;
        System.out.println(num+" ! = "+res);
    }

    static void mod()
    {
        float a, b;
        Scanner tara = new Scanner(System.in);
        System.out.print("Enter the 'a' number to calculate M(a,b):");
        a=tara.nextFloat();
        System.out.print("Enter the 'b' number:");
        b=tara.nextFloat();
        System.out.println("M("+a+" , "+b+")="+a%b);
    }

    static void rect()
    {
        float kenar1, kenar2;
        Scanner tara = new Scanner(System.in);
        System.out.print("For a rectangle in dimensions AxB, enter 'A':");
        kenar1=tara.nextFloat();
        System.out.print("For a rectangle in dimensions AxB, enter 'B':");
        kenar2=tara.nextFloat();
        System.out.println("Rectangle in dimensons of "+kenar1+"x"+kenar2+" has the area = "+kenar1*kenar2+" and periphery = "+2*(kenar1+kenar2));
    }
}
