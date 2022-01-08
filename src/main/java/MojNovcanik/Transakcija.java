package MojNovcanik;

public class Transakcija {

    private Racun racunTransakcije;
    private Kupovina iznosTransakcije;
    private Proizvod kategorijaKupovine;

    public Transakcija(Racun racunTransakcije, Kupovina iznosTransakcije, Proizvod kategorijaKupovine) {
        this.racunTransakcije = racunTransakcije;
        this.iznosTransakcije = iznosTransakcije;
        this.kategorijaKupovine = kategorijaKupovine;
    }

    public Racun getRacunTransakcije() {
        return racunTransakcije;
    }

    public Kupovina getIznosTransakcije() {
        return iznosTransakcije;
    }

    public Proizvod getKategorijaKupovine() {
        return kategorijaKupovine;
    }

    public void setRacunTransakcije(Racun racunTransakcije) {
        this.racunTransakcije = racunTransakcije;
    }

    public void setIznosTransakcije(Kupovina iznosTransakcije) {
        this.iznosTransakcije = iznosTransakcije;
    }

    public void setKategorijaKupovine(Proizvod kategorijaKupovine) {
        this.kategorijaKupovine = kategorijaKupovine;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Placanje sa racuna br: ");
        sb.append(racunTransakcije.getBrojRacuna());
        sb.append("\n");

        sb.append("Iznos transakcije: ");
        sb.append(iznosTransakcije.getIznos());
        sb.append("\n");

        sb.append("Kategorija: ");
        sb.append(kategorijaKupovine.getKategorija());
        sb.append("\n");

        return sb.toString();
    }


}
