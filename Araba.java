public class Araba
{
    /*Nitelikler*/

    String kasa;
    String renk;
    String model;
    int hiz;
    int HizLimit;



    /*Sinif metodlari*/

    Araba(String model, String renk, String kasa, int hiz)
    {
        this.model=model;
        this.hiz=hiz;
        this.renk=renk;
        this.kasa=kasa;

    }

    void HizArtir(int ArtMiktar)
    {
        if((this.hiz+ArtMiktar)<this.HizLimit)
        this.hiz+=ArtMiktar;

    }

    void HizAzalt(int AzaltMiktar)
    {
        if(this.hiz>0)
        this.hiz-=AzaltMiktar;
    }

    void InfoPrint()
    {
        System.out.println("Model: "+this.model);
        System.out.println("Renk: "+this.renk);
        System.out.println("Kasa: "+this.kasa);
        System.out.println("Hiz: "+this.hiz);
    }
}
