package MojNovcanik;



import java.util.ArrayList;

public class SveTransakcije {
   private String datumTransakcije;
   private ArrayList<Transakcija> nizTransakcija;
   private double iznos;

    public SveTransakcije(String datumTransakcije) {
        this.datumTransakcije = datumTransakcije;
        this.nizTransakcija = new ArrayList<>();
        this.iznos=0;

    }



    public String getDatumTransakcije() {
        return datumTransakcije;
    }

    public ArrayList<Transakcija> getNizTransakcija() {
        return nizTransakcija;
    }


    public void setDatumTransakcije(String datumTransakcije) {
        this.datumTransakcije = datumTransakcije;
    }

    public void setNizTransakcija(ArrayList<Transakcija> nizTransakcija) {
        this.nizTransakcija = nizTransakcija;
    }

    public void dodajTransakciju(Transakcija t) {
        nizTransakcija.add(t);
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();

        if(nizTransakcija.isEmpty()==true) {
            sb.append("Nemate nikakvih Transakcija: ");
        }

        else {
            sb.append("Imate sledece transakcije: ");
            for(Transakcija t : nizTransakcija){
                sb.append("Broj transakcije: ").append(t.getBrojTransakcije());
                sb.append("\n");
                sb.append("Datum transakcije: ").append(t.getDatumTransakcije());
                sb.append("\n");
                sb.append("Iznos transakcije: ").append(t.getIznosTransakcije());
                sb.append("\n");

            }
                sb.append(nizTransakcija);

        }
        return sb.toString();
    }
}
