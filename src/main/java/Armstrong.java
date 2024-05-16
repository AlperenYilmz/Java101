import java.util.Scanner;
import java.lang.Math;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int length, sayi, i, armst=0, sayiComp, sum=0;
        int[] intArray = new int[50];
        System.out.print("This program finds if the input number is an Armstrong number, and calculates the sum of digits." +
                "\nArmstrong number example: if 1234 = 1^4+2^4+3^4+4^4, then 1234 is an Armstrong Number"+
                "\nEnter a number:");
        sayi = tara.nextInt();
        sayiComp = sayi;
        length = (int) (Math.log10(sayi) + 1);
        for(i=0;i<length;i++)
        {
            intArray[length-i-1] = sayi%10;
            armst += Math.pow(intArray[length-i-1],length);
            sum += intArray[length-i-1];
            sayi/=10;
        }

        if(armst==sayiComp)
            System.out.printf("The number %d you entered is an Armstrong number.",sayiComp);
        else
            System.out.printf("The number %d you entered is not an Armstrong number.",sayiComp);

        System.out.printf("\nDigit sum of the number %d is: %d",sayiComp,sum);
    }
}
