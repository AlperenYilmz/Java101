import java.util.Scanner;
import java.lang.Math;
public class gcf_lcm
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int i=1, ebob, bgNum, ekok;
        System.out.print("This code finds the 'greatest common factor' and 'least common multiple' of 2 numbers you type in\nType in the first number:");
        int int1 =(int) tara.nextFloat();
        System.out.print("Second number:");
        int int2 =(int) tara.nextFloat();   // integer inputs can be controlled with hasNextInt or a try-catch block

        bgNum = Math.max(int1, int2);

        while (bgNum>=1)
        {
            if (int1%bgNum==0 && int2%bgNum==0)
            {
                ebob = bgNum;
                System.out.println("GCF of your two inputs: " +ebob);
                break;
            }
            bgNum-=1;
        }

        while (i<=(int1*int2))
        {
            if (i%int1==0 && i%int2==0)
            {
                ekok=i;
                System.out.print("LCM of your two inputs: " +ekok);
                break;
            }
            i++;
        }
    }
}


/*  PROTOTYPE
Array ile 2'den fazla sayı ebob-ekok prototipi
Scanner tara = new Scanner(System.in);
        int ebok[] = new int[20], girdi,test=1;
        System.out.println("Bu kod, gireceginiz sayilarin ebob ve ekokunu bulur.\nBir pozitif tamsayi giriniz:");
        girdi = tara.nextInt();
        if(girdi<1)
        {
            System.out.print("Hatali giris. Cikilacak.");
            System.exit(0);
        }
        else
        ebok[0]=girdi;
        while(girdi!=0)
        {
            System.out.print("Bir pozitif tamsayi giriniz. (Girisi sonlandirmak icin 0 giriniz):");
            girdi = tara.nextInt();
            ebok[test]=girdi;
            test+=1;
        }

        while()
 */