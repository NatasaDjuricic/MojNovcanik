package MojNovcanik;

public class Transakcija {

    private int brojTransakcije;
    private String datumTransakcije;
    private RacunZaPlacanje iznosTransakcije;


    public Transakcija(int brojTransakcije, String datumTransakcije, RacunZaPlacanje iznosTransakcije) {
        this.datumTransakcije = datumTransakcije;
        this.brojTransakcije = brojTransakcije;
        this.iznosTransakcije = iznosTransakcije;

    }

    public int getBrojTransakcije() {
        return brojTransakcije;
    }

    public String getDatumTransakcije() {
        return datumTransakcije;
    }

    public int getRacunTransakcije() {
        return brojTransakcije;
    }

    public RacunZaPlacanje getIznosTransakcije() {
        return iznosTransakcije;
    }

    public void setBrojTransakcije(int brojTransakcije) {
        this.brojTransakcije = brojTransakcije;
    }

    public void setDatumTransakcije(String datumTransakcije) {
        this.datumTransakcije = datumTransakcije;
    }

    public void setRacunTransakcije(int racunTransakcije) {
        this.brojTransakcije = racunTransakcije;
    }

    public void setIznosTransakcije(RacunZaPlacanje iznosTransakcije) {
        this.iznosTransakcije = iznosTransakcije;
    }



    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Broj transakcije: ");
        sb.append(brojTransakcije);
        sb.append("\n");

        sb.append("Datum transakcije: ");
        sb.append(datumTransakcije);
        sb.append("\n");

        sb.append("Iznos transakcije: ");
        sb.append(iznosTransakcije);
        sb.append("\n");


        return sb.toString();
    }


}
