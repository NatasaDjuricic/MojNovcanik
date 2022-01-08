package MojNovcanik;

import java.util.ArrayList;

public class MojiRacuni {
    private Osoba vlasnik;
    private ArrayList<Racun> nizDinarskihRacuna;


    public MojiRacuni(Osoba vlasnik) {
        this.vlasnik = vlasnik;
        this.nizDinarskihRacuna = new ArrayList<>();
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }


    public ArrayList<Racun> getnizDinarskihRacuna() {
        return nizDinarskihRacuna;
    }

    //Dodajem racun u niz

    public void dodajRacun(Racun dr) {
        nizDinarskihRacuna.add(dr);
    }

    //Brisem racun iz niza
    public void ukloniRacun(Racun dr) {
        nizDinarskihRacuna.remove(dr);
    }

    //Pravim String metodu koja ce ispisati ono sto zelim kada pozovem ovu metodu u main
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (nizDinarskihRacuna.isEmpty() == true) {
            sb.append("Nemate nijedan racun!\n ");
        } else {

            sb.append("\nVlasnik racuna: ").append(vlasnik.getIme()).append(" ").append(vlasnik.getPrezime());
            sb.append("\n");
            sb.append("\nImate sledece racune: \n");
            for (Racun dinarskiRacun : nizDinarskihRacuna) {
                sb.append(dinarskiRacun.toString());

            }

        }
        return sb.toString();

    }
}