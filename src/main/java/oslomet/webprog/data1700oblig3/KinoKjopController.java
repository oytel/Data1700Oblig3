package oslomet.webprog.data1700oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KinoKjopController {

    @Autowired
    KinoKjopRepository rep;

    @GetMapping("/lagre")
    public void lagreKinoKjop(KinoKjop innKinoKjop){rep.lagreKinoKjop(innKinoKjop);}

    @GetMapping("/hentAlle")
    public List<KinoKjop> hentAlle(){
        return rep.hentAlleKinoKjop();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.slettAlleKinoKjop();
    }
}