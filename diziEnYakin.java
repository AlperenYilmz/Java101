import java.lang.reflect.Array;
import java.util.*;

public class diziEnYakin
{
    public static void main(String[] args)
    {
        int closeMin = 0, closeMax = 0;
        int[] testArr = {-6,-3,5,235,78,4,1,7,9,456,23,7,78,2,234,-467,-35,-234};
        Scanner tara = new Scanner(System.in);
        System.out.println("Dizi: "+Arrays.toString(testArr));
        System.out.print("Bir sayi giriniz:");
        int girdi = tara.nextInt();
        int[] ArrCopy = Arrays.copyOf(testArr,testArr.length);
        Arrays.sort(ArrCopy);

        if(girdi<=ArrCopy[0])
            System.out.println("Girilen sayidan buyuk en yakin sayi = "+ArrCopy[0]+"\nGirilen sayidan kucuk en yakin sayi yoktur.");

        else if(girdi>=ArrCopy[ArrCopy.length-1])
            System.out.println("Girilen sayidan buyuk en yakin sayi yoktur.\nGirilen sayidan kucuk en yakin sayi = "+ArrCopy[ArrCopy.length-1]);

        else
        {
            for (int i=0;i<ArrCopy.length-2;i++)
            {
                if(girdi>ArrCopy[i])
                {
                    closeMin = ArrCopy[i];
                    closeMax = ArrCopy[i+1];
                }
            }
            System.out.println("Girilen sayidan buyuk en yakin sayi = "+closeMax+"\nGirilen sayidan kucuk en yakin sayi = "+closeMin);
        }
    }
}
