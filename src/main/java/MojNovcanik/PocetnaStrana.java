package MojNovcanik;

import java.util.ArrayList;
import java.util.Scanner;

public class PocetnaStrana {
    public static void main(String[] args) {

        //Prvo se logujem...Pre ovoga treba Sign up, ali ne znam da ga napravim
        //To zamisljam da bi trebalo da se napravi prvo Sign up
        //pa da upise te podatke u neki excel file (Appache POI)
        //pa pri logovanju da iscita sve usernameove i passworde koji su sacuvani u excelu
        //i da uporedi sa ukucanim usernameom i passwordom(username sa usernames, password sa passwords
        String Username;
        String Password;
        //Posto nemam Sign up stavila sam neki ussername i password za poredjenje
        Password = "123";
        Username = "natasa";

        //pravim Osobu
        Osoba o =new Osoba("Natasa", "Djuricic");

        //Pravim neke Racune
        Racun dr1 = new Racun(o, "BA123456", 50000.00, "RSD");
        Racun dr2 = new Racun(o, "AB123456", 20000.00, "RSD");
        Racun dr3 = new Racun(o, "CA12345", 10000.00, "RSD");


        //Pravim niz Racuna iz klase Moji Racuni
        MojiRacuni mojiRacuni = new MojiRacuni(o);

        //dodajem racune u niz
        mojiRacuni.dodajRacun(dr1);
        mojiRacuni.dodajRacun(dr2);

        //uklanjam racune iz niza
        mojiRacuni.ukloniRacun(dr2);

        //Pravim proizvod koji cu da kupim preko racuna
        Proizvod p1 = new Proizvod("Mleko", 80, "Hrana");
        Proizvod p2 = new Proizvod("Sok", 100, "Hrana");
        Proizvod p3 = new Proizvod("Hleb", 50, "Hrana");

        //Pravim kupovinu
        Kupovina k1 = new Kupovina("29.12.2029");
        k1.dodajProizvod(p1);
        k1.dodajProizvod(p2);
        k1.dodajProizvod(p3);


        //Pravim Transakciju koja prikazuje podatke o kupovini placene preko racuna
        Transakcija tr = new Transakcija(dr1, k1, p1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite korisnicko ime : ");
        String username = sc.next();

        System.out.print("Unesite sifru : ");
        String password = sc.next();

        //ako su isername i password tacni iylistava mi Meni
        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Dobrodosli!");
            //Ovde izlistava Glavni meni
            System.out.println("1. Moji Racuni");
            System.out.println("2. Placanja");
            System.out.println("3. Menjacnica");
            System.out.println("4. Izadji iz programa");
            System.out.print("Unesite opciju koju zelite: ");

            //Korisnik bira opciju koju zeli
            int opcija = sc.nextInt();

            //sa Switch ulazimo u opciju koju zelimo
            switch (opcija) {
                //Opcija 1 izlistava broj racuna i stanje na racunu
                //jos nisam resila kako da ne prekine program posle izabrane opcije
                //vec da vrati
                case 1 :

                    System.out.println(mojiRacuni);


                    break;

                case 2 :

                    System.out.println(tr);

                case 3:
                    System.out.print("Iznos koji zelite da promenite: ");
                    double iznosKojiSeMenja = sc.nextInt();
                    System.out.print("Koju valutu menjate: ");
                    String valutaKojaSeMenja = sc.next();

                    MenjanjeDevizaUDinare md = new MenjanjeDevizaUDinare(iznosKojiSeMenja, valutaKojaSeMenja);

                    System.out.println("Iznos: " + md.pretvaraUDinare(valutaKojaSeMenja, iznosKojiSeMenja));




            }
        }

        else if (username.equals(Username)) {
            System.out.println("Netacna lozinka!");
        } else if (password.equals(Password)) {
            System.out.println("Netacno korisnicko ime!");
        } else {
            System.out.println("Netacno korisnicko ime i lozinka!");
        }

    }

}

