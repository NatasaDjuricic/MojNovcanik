package MojNovcanik;

import java.util.ArrayList;

public class Proizvod {
    private String naziv;
    private double cena;
    private String kategorija;


    public Proizvod(String naziv, double cena, String kategorija) {
        this.naziv = naziv;
        this.cena = cena;

        if (kategorija.equals("Hrana")) {
            this.kategorija = "Hrana";
        }
        else  if (kategorija.equals("Benzin")) {
            this.kategorija = "Benzin";
        }

        else  if (kategorija.equals("Zabava")) {
            this.kategorija = "Zabava";
        }

        else  if (kategorija.equals("Stan")) {
            this.kategorija = "Stan";
        }

        else {
            System.out.println("Ne postoji kategorija");
        }
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }



    public double metodica(ArrayList <Integer> a){
        for(int e : a){
            System.out.println(e);
        }
        return 0;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setNaziv(String naziv) {

        this.naziv = naziv;
    }

    public void setCena(double cena) {

        this.cena = cena;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv proizvoda: ");
        sb.append(naziv);
        sb.append("\n");

        sb.append("Cena proizvoda: ");
        sb.append(cena);
        sb.append("\n");

        sb.append("Kategorija proizvoda: ");
        sb.append(kategorija);
        sb.append("\n");

        return sb.toString();
    }
}
