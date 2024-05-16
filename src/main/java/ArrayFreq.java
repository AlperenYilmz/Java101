import java.util.Scanner;
import java.util.Arrays;

public class ArrayFreq
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        System.out.println("This program finds the number of occurences in the entered array.");
        int size;
        while(true)
        {
            System.out.print("Enter array size:");
            size = tara.nextInt();
            if (size<1)
                System.out.println("Invalid entry! Try again.\n");
            else
                break;
        }

        int[] arr = new int[size];      // creating an array in size of "size"

        for(int i=0;i<size;i++)     // loop for defining array elements
        {
            System.out.printf("Enter the %d. element of the array:", i+1);
            arr[i]= tara.nextInt();
        }

        System.out.println("\nYour array: " + Arrays.toString(arr) + "\n");

        int [] test = new int[arr.length];
        int trp = -1;

        for(int i=0; i<arr.length; i++)
        {
            int cnt = 1;
            for(int j=i+1; j<arr.length; j++)
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

        System.out.println("Number   /   # of occurence(s)");
        for(int i=0;i<test.length;i++)
        {
            if(test[i]!=trp)
                System.out.println(+arr[i]+"      /   "+test[i]);
        }
    }
}
