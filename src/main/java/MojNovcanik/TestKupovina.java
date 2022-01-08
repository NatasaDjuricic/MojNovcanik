package MojNovcanik;


import java.util.ArrayList;

public class TestKupovina {

    public static void aaMetoda(int aa, Proizvod pp){
        aa = 7;
        pp.setCena(120);
    }

    public static void main(String[] args) {
        Proizvod p1 = new Proizvod("Mleko", 100, "Hrana");
        Proizvod p2 = new Proizvod("Secer", 80, "Benzin");
        Proizvod p3 = new Proizvod("Brasno", 70, "Zabava");
        Proizvod p4= new Proizvod("Mleko", 100, "Stan");

        int a = 3;

        System.out.println(a);
        System.out.println(p1);

        // prvi nacin
        Kupovina r1 = new Kupovina("");

        r1.dodajProizvod(p1);
        System.out.println(r1);

        r1.dodajProizvod(p2);
        System.out.println(r1);

        r1.dodajProizvod(p3);
        System.out.println(r1);

        r1.ukloniProizvod(p3);
        System.out.println(r1);

        r1.ukloniProizvod(p3);
        System.out.println(r1);

        // drugi nacin
        ArrayList<Proizvod> nizKupljenihProzivoda = new ArrayList<Proizvod>();
        nizKupljenihProzivoda.add(p1);
        nizKupljenihProzivoda.add(p2);
        nizKupljenihProzivoda.add(p3);
        Kupovina r2 = new Kupovina(nizKupljenihProzivoda, "27.12.2021");
        System.out.println(r2);
        r2.ukloniProizvod(p2);
    }
}
