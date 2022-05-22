public class Ders
{
    Teacher DersinHocasi;
    String isim;
    String kod;
    String pref;
    int YaziliNot, SozluNot;

    public Ders(String isim, String kod, String pref)
    {
        this.isim = isim;
        this.kod = kod;
        this.pref = pref;
        this.YaziliNot = 0;
        this.SozluNot = 0;
    }

    public void OgrtEkle(Teacher t)
    {
        if (this.pref.equals(t.brans))
        {
            this.DersinHocasi = t;
            System.out.println("Islem basarili.");
        }
        else
            System.out.println(t.isim+" isimli egitmen bu dersi veremez.");
    }

    public void printTeacher()
    {
        if (DersinHocasi != null)
            System.out.println(this.isim+" dersinin egitmeni: "+DersinHocasi.isim);
        else
            System.out.println(this.isim+" dersine egitmen atanmamistir.");
    }
}