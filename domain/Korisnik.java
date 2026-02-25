public class Korisnik{
    private String ime;
    private String prezime;
    private String JMBG;
    private Integer godine;
    private String telefon;

    public Korisnik(String ime, String prezime, String JMBG, Integer godine, String telefon) {
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
        this.godine = godine;
        this.telefon = telefon;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public Integer getGodine() {
        return godine;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public void setGodine(Integer godine) {
        this.godine = godine;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    
}