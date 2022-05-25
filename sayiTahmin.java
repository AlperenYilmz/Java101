import java.util.*;

public class sayiTahmin
{
    public static void main(String[] args)
    {
        Scanner tara = new Scanner(System.in);
        Random rnd = new Random();
        int sayi= rnd.nextInt(100), hak=0, choice;
        System.out.println("Sayi tahmin oyununa hosgeldiniz. Sayi 0-100 arasinda olacaktir. Tahmin icin 5 hakkiniz var.");

        while(hak<5)
        {
            System.out.printf("Lutfen tahmininizi giriniz (Kalan hak=%d):",5-hak);
            choice= tara.nextInt();
            if(choice<0 || choice>99)
            {
                System.out.println("Yanlis aralikta bir sayi girdiniz. Tekrar deneyiniz.");
                continue;
            }

            else
            {
                if(choice==sayi)
                {
                    System.out.println("Tebrikler! Sayiyi dogru bildiniz. Sayi = "+sayi);
                    break;
                }

                else if(choice<sayi)
                    System.out.println("Daha fazla.");

                else
                    System.out.println("Daha az.");
            }
            hak++;

        }
        if(hak==5)
            System.out.println("Malesef tum haklariniz bitti ve sayiyi tahmin edemediniz. Sayi "+sayi+" idi. Neyse saglik olsun :(");
    }
}
