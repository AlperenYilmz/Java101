public class Employee
{
    String name;
    int BrutMaas, WorkHrs, EmplYear;


    Employee (String name, int sal, int hrs, int year)
    {
        this.name=name;
        this.BrutMaas=sal;
        this.WorkHrs=hrs;
        this.EmplYear=year;
    }



    public float TaxCalc(int maas)
    {
        if (maas<1000)
            return 0;
        else
            return (float) 0.03;
    }



    public int Bonus(int hour)
    {
        if(hour>40)
            return (hour-40)*30;
        else
            return 0;
    }



    public float RaiseSal(int yil)
    {
        if((2021-yil)>19)
            return (float) 0.15;

        else if((2021-yil)<20 && (2021-yil)>9)
            return (float) 0.1;

        else
            return (float) 0.05;
    }


    public void PrintEmpl()
    {
        System.out.println("=================================");
        System.out.println("Calisan adi: "+this.name);
        System.out.println("Brut maasi: "+this.BrutMaas+" TL");
        System.out.println("Calisma saati: "+this.WorkHrs);
        System.out.println("Ise baslama yili: "+this.EmplYear);
        System.out.println("Vergi miktari: "+this.BrutMaas*TaxCalc(this.BrutMaas)+" TL");
        System.out.println("Maas bonusu: "+Bonus(this.WorkHrs)+" TL");
        System.out.printf("Maas artis miktari: %.2f TL\n",this.BrutMaas*RaiseSal(this.EmplYear));
        System.out.println("Vergi ve bonuslar hesaplandiginda maas: "+(this.BrutMaas-this.BrutMaas*TaxCalc(this.BrutMaas)+Bonus(this.WorkHrs))+" TL");
        System.out.println("Toplam maas: "+(this.BrutMaas-this.BrutMaas*TaxCalc(this.BrutMaas)+Bonus(this.WorkHrs)+this.BrutMaas*RaiseSal(this.EmplYear))+" TL");
    }

}
