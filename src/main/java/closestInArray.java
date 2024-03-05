import java.util.Scanner;
import java.util.Arrays;

// This code finds the closest smaller and bigger number to your entry, looking up from the test array
public class closestInArray
{
    public static void main(String[] args)
    {
        float closeMin = 0, closeMax = 0;
        float[] testArr = {-6,-3,5,235,78,4,1,7,9,456,23,7,78,2,234,-467,-35,-234};
        Scanner tara = new Scanner(System.in);
        System.out.println("Test array: "+Arrays.toString(testArr));
        System.out.print("Type in a number:");
        float girdi = tara.nextFloat();
        float[] ArrCopy = Arrays.copyOf(testArr, testArr.length);
        Arrays.sort(ArrCopy);

        if(girdi<=ArrCopy[0])
            System.out.println("Closest bigger number to your entry: " + ArrCopy[0] + "\nThere is no smaller number in the array, than your entry.");

        else if(girdi>=ArrCopy[ArrCopy.length-1])
            System.out.println("There is no smaller number in the array, than your entry.\nGirilen sayidan kucuk en yakin sayi = " + ArrCopy[ArrCopy.length-1]);

        else if(girdi>ArrCopy[0] && girdi<ArrCopy[ArrCopy.length-1])
        {
            for (int i=0;i<ArrCopy.length-2;i++)
            {
                if(girdi>ArrCopy[i])
                {
                    closeMin = ArrCopy[i];
                    closeMax = ArrCopy[i+1];
                }
            }
            System.out.println("Closest bigger: " + closeMax+"\nClosest smaller: " + closeMin);
        }
    }
}
