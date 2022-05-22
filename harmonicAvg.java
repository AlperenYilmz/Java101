import java.util.*;

public class harmonicAvg
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,9,4,2,6};
        int num = arr.length;
        float hrmSum= 0.0F;

        System.out.println("Test dizisi: "+Arrays.toString(arr));

        for (int j : arr)
            hrmSum += (1 / (float) j);

        float hrmAvg= (float) arr.length/hrmSum;
        System.out.println("Dizinin harmonik ortalamasi: "+hrmAvg);

    }
}
