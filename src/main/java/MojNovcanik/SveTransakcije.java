package MojNovcanik;

import java.util.ArrayList;

public class SveTransakcije {
    private int brojTransakcije;
    private String datumTransakcije;
    private ArrayList<Transakcija> nizTransakcija;

    public SveTransakcije(int brojTransakcije, String datumTransakcije) {
        this.brojTransakcije = brojTransakcije;
        this.datumTransakcije = datumTransakcije;
        this.nizTransakcija = new ArrayList<>();
    }

    public int getBrojTransakcije() {
        return brojTransakcije;
    }

    public String getDatumTransakcije() {
        return datumTransakcije;
    }

    public ArrayList<Transakcija> getNizTransakcija() {
        return nizTransakcija;
    }

    public void setBrojTransakcije(int brojTransakcije) {
        this.brojTransakcije = brojTransakcije;
    }

    public void setDatumTransakcije(String datumTransakcije) {
        this.datumTransakcije = datumTransakcije;
    }

    public void setNizTransakcija(ArrayList<Transakcija> nizTransakcija) {
        this.nizTransakcija = nizTransakcija;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Broj transakcije: ");
        sb.append(brojTransakcije);
        sb.append("\n");

        sb.append("Datum transakcije: ");
        sb.append(datumTransakcije);
        sb.append("\n");

        if(nizTransakcija.isEmpty()==true) {
            sb.append("Nemate nikakvih Transakcija: ");
        }

        else {
            sb.append("Imate sledece transakcije: ");
            for(Transakcija t: nizTransakcija) {
                sb.append(nizTransakcija.toString());

            }
        }
        return sb.toString();
    }
}
