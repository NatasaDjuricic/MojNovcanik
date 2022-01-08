package MojNovcanik;

public class MenjanjeDevizaUDinare {

    private double iznos;
    private String valuta;

    public MenjanjeDevizaUDinare(double iznos, String valuta) {
        this.iznos = iznos;
        this.valuta = valuta;
    }

    public double getIznos() {

        return iznos;
    }

    public String getValuta() {

        return valuta;
    }

    public void setIznos(double iznos) {

        this.iznos = iznos;
    }

    public void setValuta(String valuta) {

        this.valuta = valuta;
    }

    // Racunam koliko dinara dobijam za iznos u evrima koji zelim da promenim
    public double pretvaraUDinare(String valuta, double iznosValute) {
        switch (valuta) {
            case "EUR" :
                iznos = iznosValute * 117.59;
                break;
    // Racunam koliko dinara dobijam za iznos u dolarima koji zelim da promenim
            case "USD" :
                iznos = iznosValute * 103.50;
            break;
    // Mogu koliko zelim case-ova da stavim za svaku stranu valutu, ali cu samo ova 2
            default:
                System.out.println("Uneli ste pogresnu valutu");
        }
            return iznos;
    }
}





