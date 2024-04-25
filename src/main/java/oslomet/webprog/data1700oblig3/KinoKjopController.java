package oslomet.webprog.data1700oblig3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KinoKjopController {
    @GetMapping("/")
    public String hei(String navn) {
        int antallBokstaver = navn.length();

        return "Hello World " + navn + "! Navnet ditt er " + antallBokstaver + " bokstaver langt!";
    }
}
