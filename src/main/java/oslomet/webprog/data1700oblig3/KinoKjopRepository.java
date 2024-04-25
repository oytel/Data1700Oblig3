package oslomet.webprog.data1700oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KinoKjopRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreKinoKjop(KinoKjop kinoKjop) {
        String sql = "INSERT INTO kinoKjop (film, antall, fornavn, etternavn, telefonnr, epost) VALUES (?,?,?,?,?,?)";
        db.update(sql, kinoKjop.getFilm(), kinoKjop.getAntall(), kinoKjop.getFornavn(), kinoKjop.getEtternavn(), kinoKjop.getTelefonnr(), kinoKjop.getEpost());
    }

    public List<KinoKjop> hentAlleKinoKjop() {
        String sql = "SELECT * FROM kinoKjop";
        List<KinoKjop> alleKinoKjop = db.query(sql, new BeanPropertyRowMapper<>(KinoKjop.class));
        return alleKinoKjop;
    }

    public void slettAlleKinoKjop() {
        String sql = "DELETE FROM kinoKjop";
        db.update(sql);
    }
}