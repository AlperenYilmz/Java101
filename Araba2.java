public class Araba2
{
    public static void main(String[] args)
    {
        Araba Audi = new Araba("A4", "Parliament Blue", "Coupee", 150);
        Araba Merso = new Araba("CL4","Midnight Blue", "Sedan", 140);
        Araba BMW = new Araba("320", "Cherry Red", "SUV", 120);

        BMW.InfoPrint();

        /*
        BMW.HizArtir(25);
        Audi.HizAzalt(5);
        */

    }
}
