package oslomet.webprog.data1700oblig3;

public class KinoKjop {
    private String fornavn;
    private String etternavn;
    private int telefonnr;
    private String epost;
    private int antall;
    private String film;

    public KinoKjop(String film, int antall, String fornavn, String etternavn, int telefonnr, String epost) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }

    public KinoKjop() {
    }

    public String getFilm() {
        return film;
    }

    public int getAntall() {
        return antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getTelefonnr() {
        return telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
