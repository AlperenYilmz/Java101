import java.util.*;

public class ArrayFreq
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz:");
        int size= tara.nextInt();
        if(size<1)
        {
            System.out.println("Hatali giris!");
            System.exit(0);
        }
        int[] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.printf("Dizinin %d. elemanini giriniz:",i+1);
            arr[i]= tara.nextInt();
        }

        System.out.println("\nGirilen dizi: "+Arrays.toString(arr)+"\n");

        int [] test = new int[arr.length];
        int trp = -1;

        for(int i=0;i<arr.length; i++)
        {
            int cnt = 1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    cnt++;
                    test[j] = trp;
                }
            }
            if(test[i]!=trp)
                test[i]=cnt;
        }

        System.out.println("Sayi   /   Siklik                                                                            (lol)");
        for(int i=0;i<test.length;i++)
        {
            if(test[i]!=trp)
                System.out.println(+arr[i]+"      /   "+test[i]);
        }

    }

}
