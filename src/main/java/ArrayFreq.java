import java.util.*;

public class ArrayFreq
{
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        ArrayList<Float> array = new ArrayList<>();
        System.out.println("This program finds the number of occurences of elements in the entered array.");
        while (true)
        {
            try
            {
                System.out.println("(Enter blank to stop input) Enter a number:");
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

        elementCounter(array);
     }
    public static void elementCounter(ArrayList<Float> testList)
    {
        ArrayList<Float> elmtCounted = new ArrayList<>();

        for (Float element : testList)
        {
            if (!elmtCounted.contains(element))
            {
                int count = 0;
                for (Float itr : testList)
                {
                    if (itr.equals(element))
                        count++;
                }
                elmtCounted.add(element);
                System.out.println(element + " occurs " + count + " times");
            }
        }
    }
}