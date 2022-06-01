public class MainOBS
{
    public static void main(String[] args)
    {
        Ders matematik = new Ders ("Matematik", "MAT101", "MAT");
        Ders fizik = new Ders ("Fizik", "FZK102", "FZK");
        Ders kimya = new Ders ("Kimya", "KMY103", "KMY");

        Teacher t1 = new Teacher("Ilker Sahin", "90550", "MAT");
        Teacher t2 = new Teacher("Gulden Secil", "90551", "FZK");
        Teacher t3 = new Teacher("Ebru Yarar", "90552", "KMY");

        matematik.OgrtEkle(t1);
        fizik.OgrtEkle(t2);
        kimya.OgrtEkle(t3);

        matematik.printTeacher();
        fizik.printTeacher();
        kimya.printTeacher();

        Student s1 = new Student("Kurt Cobain", 4, "140144015", matematik, fizik, kimya);
        s1.TopluNotGir(50,20,40,70,40,60);


        Student s2 = new Student("Dave Grohl", 4, "2211133", matematik, fizik, kimya);
        s2.TopluNotGir(100,50,40,60,50,60);


        Student s3 = new Student("Krist Novoselic", 4, "221121312", matematik, fizik, kimya);
        s3.TopluNotGir(50,20,40,60,70,40);


        s1.isPass();
        s2.isPass();
        s3.isPass();
    }
}
