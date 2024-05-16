import java.util.Arrays;
import java.util.Scanner;

public class ArraySort
{
    public static void main(String[] args)
    {
        int size, temp=0;
        Scanner tara = new Scanner(System.in);
        System.out.println("This algorithm sorts the entered array in ascending order.");


        while (true)    // Control loop for meaningful definiton of array size
        {
            System.out.print("Enter the size of the array:");
            size = tara.nextInt();
            if(size<1)
                System.out.print("Invalid entry! Try again.");
            else
                break;
        }

        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.printf("Enter the %d. element of the array:", i+1);
            arr[i]= tara.nextInt();
        }

        System.out.println("Original unsorted array: " + Arrays.toString(arr));

        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                        arr[j] = temp;
                    }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
