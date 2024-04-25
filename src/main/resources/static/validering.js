const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+[.]+[a-zA-Z]{2,4}$/;
const namePattern = /^[a-zA-ZæøåÆØÅ. \-]{2,30}$/;
const phonePattern = /^[0-9]{8}$/;
const antallPattern = /^[0-9]{1,3}$/;

function validerFilm(film){
    if(film.length===0){
        $("#feilFilm").html("Du må velge film");
        return false;
    } else {
        $("#feilFilm").html("");
        return true;
    }
}

function validerEpost(epost){
    let mailOK = emailPattern.test(epost);

    if(!mailOK) {
        $("#feilEpost").html("Ikke gyldig epost");
        return false;
    } else {
        $("#feilEpost").html("");
        return true;
    }
}

function validerForNavn(navn){
    let navnOK = namePattern.test(navn);

    if(!navnOK) {
        $("#feilNavn").html("Du må ha minst to bokstaver");
        return false;
    } else {
        $("#feilNavn").html("");
        return true;
    }
}
function validerEtterNavn(navn){
    let navnOK = namePattern.test(navn);

    if(!navnOK) {
        $("#feilNavn1").html("Du må ha minst to bokstaver");
        return false;
    } else {
        $("#feilNavn1").html("");
        return true;
    }
}

function validerTele(tlf){
    let tlfOK = phonePattern.test(tlf);

    if(!tlfOK) {
        $("#feilTele").html("Ugyldig telefonnummer");
        return false;
    } else {
        $("#feilTele").html("");
        return true;
    }
}

function validerAntall(ant){
    let antOK = antallPattern.test(ant);

    if(!antOK || ant<=0) {
        $("#feilAnt").html("Det må være et tall større enn 0");
        return false;
    } else {
        $("#feilAnt").html("");
        return true;
    }
}