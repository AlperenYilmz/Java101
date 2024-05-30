import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        String inp;
        int length, armst=0, sum=0, temp, inpInt=0;
        int[] intArray = new int[50];
        System.out.print("This program finds if the input number is an Armstrong number, and calculates the sum of digits." +
                "\nArmstrong number example: if 1234 = 1^4+2^4+3^4+4^4, then 1234 is an Armstrong Number\n");
        while (true)
        {
            System.out.print("(Press blank enter to exit) Enter a number:");
            inp = tara.nextLine();
            if(inp.isEmpty())
            {
                System.out.println("Exiting...");
                break;
            }
            try
            {
                inpInt=Integer.parseInt(inp.trim());
                temp=inpInt;
                length = (int) (Math.log10(inpInt) + 1);
                for(int i=0;i<length;i++)
                {
                    intArray[length-i-1] = temp%10;
                    armst += Math.pow(intArray[length-i-1],length);
                    sum += intArray[length-i-1];
                    temp/=10;
                }
                break;
            }catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        if(armst==inpInt)
            System.out.printf("The number %d you entered is an Armstrong number.", inpInt);
        else
            System.out.printf("The number %d you entered is not an Armstrong number.", inpInt);

        System.out.printf("\nDigit sum of the number %d is: %d", inpInt, sum);
    }
}