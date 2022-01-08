package MojNovcanik;

public class Racun {

    public Osoba vlasnikRacuna;
    private String brojRacuna;
    private double stanjenaRacunu;
    private String valuta;

    public Racun(Osoba vlasnikRacuna, String brojRacuna, double stanjenaRacunu, String valuta) {
        this.vlasnikRacuna =vlasnikRacuna;
        this.brojRacuna = brojRacuna;
        this.stanjenaRacunu = stanjenaRacunu;
        this.valuta = valuta;
    }

    public Osoba getVlasnikRacuna() {
        return vlasnikRacuna;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public double getStanjenaRacunu() {
        return stanjenaRacunu;
    }

    public String getValuta() {
        return valuta;
    }

    public void setVlasnikRacuna(Osoba vlasnikRacuna) {
        this.vlasnikRacuna = vlasnikRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setStanjenaRacunu(double stanjenaRacunu) {
        this.stanjenaRacunu = stanjenaRacunu;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public double novoStanjenaRacunu(Proizvod p) {
        double novoStanje = stanjenaRacunu - p.getCena();
        return novoStanje;
    }

    public String toString () {

        StringBuilder sb = new StringBuilder();
        sb.append("\nRacun broj: ").append(brojRacuna);
        sb.append("\n");

        sb.append("Stanje racunu: ").append(stanjenaRacunu).append(" ").append(valuta);
        sb.append("\n");


        return sb.toString();

    }





}
