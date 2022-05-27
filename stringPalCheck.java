import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class stringPalCheck
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
        System.out.print("Iki farkli metodla palindrom test ediyoruz. Lutfen test edeceginiz kelimeyi giriniz:");
        String test= tara.nextLine();
        System.out.println("Indexing metodu: "+palCheck1(test));
        System.out.println("String kopyalama metodu: "+palCheck2(test));

    }
}
