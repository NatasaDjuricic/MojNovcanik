package MojNovcanik;



import java.util.ArrayList;

public class RacunZaPlacanje {
    private ArrayList<Proizvod> nizKupljenihProizvoda;
    private String datum;
    private double iznos;

    public RacunZaPlacanje(String datum) {
        this.nizKupljenihProizvoda = new ArrayList<>();
        this.datum = datum;
        this.iznos = 0;
        for(Proizvod p : nizKupljenihProizvoda){
            this.iznos = this.iznos + p.getCena();
        }
    }


    public ArrayList<Proizvod> getNizKupljenihProizvoda() {
        return nizKupljenihProizvoda;
    }

    public String getDatum() {
        return datum;
    }

    public double getIznos() {
        return iznos;
    }

    public void setNizKupljenihProizvoda(ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }


    public void dodajProizvod(Proizvod p){
        nizKupljenihProizvoda.add(p);
        iznos += p.getCena();
    }

    public void ukloniProizvod(Proizvod p){
        boolean uklonjen = nizKupljenihProizvoda.remove(p);
        if(uklonjen == true){
            iznos = iznos - p.getCena();
        }
        else{
            System.out.println("Proizvod ne postji u nizu!");
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Datum: ");
        sb.append(datum);
        sb.append("\n");


        sb.append("Kupjeni proizvodi: \n");
        for(Proizvod p : nizKupljenihProizvoda){
            sb.append(p.getNaziv());
            sb.append(" - ");
            sb.append(p.getCena());
            sb.append("\n");
        }

        sb.append("Ukupan Iznos za placanje: ");
        sb.append(iznos);
        sb.append("\n");

        return sb.toString();
    }
}
