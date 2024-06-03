import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayFreq
{
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        ArrayList<Float> array = new ArrayList<>();
        System.out.println("This program finds the number of occurence in the entered array.");
        while (true) {
            try {
                System.out.println("Enter a number:");
                String inp = tara.nextLine();
                if (inp.isEmpty()) {
                    System.out.println("Exiting...");
                    break;
                }
                array.add(Float.parseFloat(inp));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again.");
            }
        }

        if (array.isEmpty()) {
            System.out.println("No entries, program will be terminated.");
            System.exit(0);
        }

        System.out.println("Numbers entered:");
        for (Float element : array)
            System.out.println(element);

        Collections.sort(array);    // original array is now changed

        System.out.println("Sorted array:");
        for (Float element : array)
            System.out.println(element);
    }
}