package oslomet.webprog.data1700oblig3;

public class KinoKjop {
    private int id;
    private String fornavn;
    private String etternavn;
    private int telefon;
    private String email;
    private int antall;
    private String film;

    public KinoKjop(int id, String film, int antall, String fornavn, String etternavn, int telefon, String email) {
        this.id = id;
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.email = email;
    }

    public KinoKjop() {
    }

    public int getId() {return id;}

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

    public int getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {this.id = id;}

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

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
