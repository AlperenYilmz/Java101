import java.util.Scanner;

public class palindromeChecker
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        int test;
        System.out.print("Palindrom olup olmadigini kontrol etmek istediginiz sayiyi giriniz:");
        test = tara.nextInt();

        System.out.print(palCheck(test) ? "Girdiginiz "+test+" sayisi palindromdur.":"Girdiginiz "+test+" sayisi palindrom degildir.");

    }

    static boolean palCheck(int a)
    {
        int temp=a, revNum=0, lastDigit;

        while (temp!=0)
        {
            lastDigit=temp%10;
            revNum=(revNum*10)+lastDigit;
            temp/=10;
        }
        return revNum == a;
    }



}
