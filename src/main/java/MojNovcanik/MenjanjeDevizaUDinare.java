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

    public double pretvaraUDinare(String valuta, double iznosValute) {
        switch (valuta) {
            case "EUR" :
                iznos = iznosValute * 117.59;
                break;

            case "USD" :
                iznos = iznosValute * 103.50;
            break;
            default:
                System.out.println("Uneli ste pogresnu valutu");
        }
            return iznos;
    }
}





