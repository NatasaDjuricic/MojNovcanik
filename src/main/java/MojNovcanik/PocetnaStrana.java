package MojNovcanik;

import java.util.Scanner;

public class PocetnaStrana {
    public static void main(String[] args) {

        //Prvo se logujem...Pre ovoga treba Sign up, ali ne znam da ga napravim
        //To zamisljam da bi trebalo da se napravi prvo Sign up
        //pa da upise te podatke u neki excel file (Appache POI)
        //pa pri logovanju da iscita sve usernameove i passworde koji su sacuvani u excelu
        //i da uporedi sa ukucanim usernameom i passwordom(username sa usernames, password sa passwords)
        //ako se oba poklapaju pusta dalje, ako se ne poklapa ili username ili password
        String Username;
        String Password;
        //Posto nemam Sign up stavila sam neki ussername i password za poredjenje
        Password = "123";
        Username = "natasa";

        //pravim Osobu
        Osoba o = new Osoba("Natasa", "Djuricic");

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

        //Pravim proizvod koji cu da stavim na Racun za placanje
        Proizvod p1 = new Proizvod("Mleko", 80, "Hrana");
        Proizvod p2 = new Proizvod("Sok", 100, "Hrana");
        Proizvod p3 = new Proizvod("Hleb", 50, "Hrana");


        //Pravim Racun za placanje
        RacunZaPlacanje rzp1 = new RacunZaPlacanje("11.11.2021.");
        rzp1.dodajProizvod(p1);
        rzp1.dodajProizvod(p2);
        rzp1.dodajProizvod(p3);

        RacunZaPlacanje rzp2 = new RacunZaPlacanje("12.12.2021");
        rzp2.dodajProizvod(p1);

        RacunZaPlacanje rzp3 = new RacunZaPlacanje("01.01.2022.");
        rzp3.dodajProizvod(p3);




        //Pravim Transakcije koje su izvrsene
        //svaka transakcija sadrzi broj transakcije, datum transakcije i racun
        Transakcija tr1 = new Transakcija(1, "11.11.2021.", rzp1);
        Transakcija tr2 = new Transakcija(2, "12.12.2021.", rzp2);
        Transakcija tr3 = new Transakcija(3, "01.01.2022.", rzp2);

        //Pravim nizTransakcija
        SveTransakcije st1 = new SveTransakcije("01.01.2021.");
        st1.dodajTransakciju(tr1);
        st1.dodajTransakciju(tr2);
        st1.dodajTransakciju(tr3);



        //Logovannje
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite korisnicko ime : ");
        String username = sc.next();

        System.out.print("Unesite sifru : ");
        String password = sc.next();

        // Ne stavljam posebno u if else da li su password ili username netacni
        //jer je dovoljan jedan uslov da se ne ispuni islov za logovanje
         if (!username.equals(Username) || !password.equals(Password)) {
                System.out.println("Netacno korisnicko ime ili lozinka!");
                System.out.println("Netacno korisnicko ime!");
            }

        //ako su username i password tacni izlistava mi Meni
        else  /*(username.equals(Username) && password.equals(Password))*/ {
             System.out.println("Dobrodosli!");

         }
        //preko booleana i while uslovljavama da se kuca opcija za izlazak iz menija
        //ili da se bira neka druga opcija
        // ovo ne bih znala, nego sam nasla na internetu kako da resim
            boolean exit = false;

            //Cuvamo promenljivu
            int opcija;

            // sa while petljom vrtimo meni kako ne bismo izasli iz programa
            while (!exit) {
                //Ovde izlistava Glavni meni
                System.out.println("1. Moji Racuni");
                System.out.println("2. Placanja");
                System.out.println("3. Transakcije");
                System.out.println("4. Menjacnica");
                System.out.println("5. Izadji iz programa");
                System.out.print("Unesite opciju koju zelite: ");

                opcija = sc.nextInt();


                //sa Switch ulazimo u opciju koju zelimo
                switch (opcija) {
                    //Opcija 1 izlistava broj racuna i stanje na racunu
                    case 1:

                        System.out.println(mojiRacuni);

                        break;


                    // Opcija 2 vrsi placanja, tj. skida sa stanja na racunu iznos transakcije
                    case 2:

                        System.out.println("Za placanje : " + rzp1);

                        System.out.print("Da li zelite da platite ovaj racun: ");
                        String opc1 = sc.next();
                        switch (opc1) {
                            case "DA":

                                dr1.setStanjenaRacunu(dr1.getStanjenaRacunu() - rzp1.getIznos());
                                System.out.print("Novo stanje na racunu: " + dr1);
                            break; // Ovde mi break ne izlazi na kraj programa, u case 4 izlazi ???
                            case "NE":
                                continue;
                        }
                    case 3:


                        System.out.println(st1);
                        break;


                    case 4:


                    System.out.print("Iznos koji zelite da promenite: ");
                        double iznosKojiSeMenja = sc.nextInt();
                        System.out.print("Koju valutu menjate: ");
                        String valutaKojaSeMenja = sc.next();

                        MenjanjeDevizaUDinare md = new MenjanjeDevizaUDinare(iznosKojiSeMenja, valutaKojaSeMenja);

                        System.out.println("Iznos: " + md.pretvaraUDinare(valutaKojaSeMenja, iznosKojiSeMenja));

                        System.out.print("Da li zelite da prebacite ovaj novac na dinarski racun : ");
                        String opc = sc.next();
                        switch (opc) {
                            case "DA":
                                dr1.setStanjenaRacunu(dr1.getStanjenaRacunu() + md.pretvaraUDinare(valutaKojaSeMenja, iznosKojiSeMenja));
                                System.out.print("Novo stanje na racunu: " + dr1);

                         //   break; Ako stavim ovde break izlazi mi na kraj programa
                            case "NE":
                                continue;

                        }

                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Morate izabrati neku opciju");


                }
            }


        }

    }



