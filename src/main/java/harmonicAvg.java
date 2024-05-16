import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class harmonicAvg    // list approach
{
    public static void main(String[] args)
    {
        Scanner tara= new Scanner(System.in);
        int indexCnt=0, i=1;
        List<Float> userList= new ArrayList<Float>();
        float hrmSum= 0.0F;
        System.out.println("This code calculates the harmonic average of your consecutive inputs, until a blank entry.");

        while (true)
        {
            System.out.printf("Enter %d. element:",i);
            String input = tara.nextLine().trim();
            if(input.isEmpty())
                break;
            try
            {
                float value = Float.parseFloat(input);
                userList.add(value);
                i++;
            }catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        if(userList.size()==0)
        {
            System.out.println("No entries were made, thus no harmonic average.");
            System.exit(0);
        }

        else
        {
            for (float j : userList)
                hrmSum += (1 / j);
            float hrmAvg= userList.size()/hrmSum;
            System.out.println("Your array of entries: "+ Arrays.toString(userList.toArray()));
            System.out.println("Harmonic average: " +hrmAvg);
        }
    }
}