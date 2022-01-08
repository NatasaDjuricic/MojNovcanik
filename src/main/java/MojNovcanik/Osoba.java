package MojNovcanik;

// nema nista posebno za komentarisanje
// klasa sadrzi samo ime i prezime, constructor, gettere, settere i toString medodu
public class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
            sb.append("Ime i prezime: ").append(ime).append(" ").append("prezime");
            sb.append("\n");
            return sb.toString();
    }
}
