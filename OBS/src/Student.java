public class Student
{
    String isim, num;
    int classes;
    Ders matematik;
    Ders fizik;
    Ders kimya;
    float avg;
    boolean GecKontrol;


    Student (String name, int classes, String stuNo, Ders mat, Ders fizik, Ders kimya)
    {
        this.isim = name;
        this.classes = classes;
        this.num = stuNo;
        this.matematik = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        OrtHesapla();
        this.GecKontrol = false;
    }

    public void TopluNotGir (int matY, int matS, int fizikY, int fizikS, int kimyaY, int kimyaS)
    {
        if (matY >= 0 && matY <= 100)
            this.matematik.YaziliNot = matY;

        if (fizikY >= 0 && fizikY <= 100)
            this.fizik.YaziliNot = fizikY;

        if (kimyaY >= 0 && kimyaY <= 100)
            this.kimya.YaziliNot = kimyaY;

        if (matS >= 0 && matS <= 100)
            this.matematik.SozluNot = matS;

        if (fizikS >= 0 && fizikS <= 100)
            this.fizik.SozluNot = fizikS;

        if (kimyaS >= 0 && kimyaS <= 100)
            this.kimya.SozluNot = kimyaS;
    }

    public void isPass()
    {
        if (this.matematik.YaziliNot==0 || this.fizik.YaziliNot==0 || this.kimya.YaziliNot==0 || this.matematik.SozluNot==0 || this.fizik.SozluNot==0 || this.kimya.SozluNot==0)
            System.out.println("Hata! Notlar henuz tamamen girilmemis.");
        else
        {
            this.GecKontrol = isCheckPass();
            printNote();
            System.out.printf("Ortalama: %.2f\n",this.avg);
            if (this.GecKontrol)
                System.out.println("Sinifi gectiniz.");
            else
                System.out.println("Sinifta kaldiniz.");
        }
    }

    public void OrtHesapla()
    {
        this.avg = (float) (this.fizik.YaziliNot*0.8 + this.fizik.SozluNot*0.2 + this.matematik.YaziliNot*0.8 + this.matematik.SozluNot*0.2 + this.kimya.YaziliNot*0.8 + this.kimya.SozluNot*0.2)/3;
    }

    public boolean isCheckPass()
    {
        OrtHesapla();
        return this.avg > 55;
    }

    public void printNote()
    {
        System.out.println("///////////////////////////////////////////");
        System.out.println("Ogrenci: "+this.isim);
        System.out.println("Matematik Yazili Notu: "+this.matematik.YaziliNot);
        System.out.println("Fizik Yazili Notu: "+this.fizik.YaziliNot);
        System.out.println("Kimya Yazili Notu: "+this.kimya.YaziliNot);
        System.out.println("Matematik Sozlu Notu: "+this.matematik.SozluNot);
        System.out.println("Fizik Sozlu Notu: "+this.fizik.SozluNot);
        System.out.println("Kimya Sozlu Notu: "+this.kimya.SozluNot);
    }
}