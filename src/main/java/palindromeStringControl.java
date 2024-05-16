import java.util.Scanner;
public class palindromeStringControl
{
    static boolean palCheck1(String str1)
    {
        int i=0, j=str1.length()-1;
        while(i<j)
        {
            if(str1.charAt(i)!=str1.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean palCheck2(String str2)
    {
        String rev="";
        for(int i=str2.length()-1;i>=0;i--)
        {
            rev+=str2.charAt(i);
        }
        return str2.equals(rev);
    }

    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        System.out.print("This code checks if the entered string is palindrome, with 2 different methods. \nNow enter a word:");
        String test= tara.nextLine();
        System.out.println("Indexing method: "+palCheck1(test));
        System.out.println("String copy method: "+palCheck2(test));

    }
}
