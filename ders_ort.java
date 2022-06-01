/*
String değişken (kriter) ? "Kriter sağlanırsa çıkacak yazı" : "Kriter sağlanmazsa çıkacak yazı" ;
*/


import java.util.Scanner;

public class ders_ort
{
    public static void main(String[] args)
    {
        int mat, fzk, kmy, trh, mzk, trk, sum;
        float ort;
        Scanner tara = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat = tara.nextInt();

        System.out.print("\nFizik notunu giriniz:");
        fzk = tara.nextInt();

        System.out.print("\nKimya notunu giriniz:");
        kmy = tara.nextInt();

        System.out.print("\nTarih notunu giriniz:");
        trh = tara.nextInt();

        System.out.print("\nMuzik notunu giriniz:");
        mzk = tara.nextInt();

        System.out.print("\nTurkce notunu giriniz:");
        trk = tara.nextInt();

        sum = (mat+fzk+kmy+trh+mzk+trk);
        ort = sum/6;

        System.out.printf("Ortalamaniz:%.3f\n", ort);
        System.out.println(ort<60? "Kaldiniz":"Gectiniz");
    }
}
