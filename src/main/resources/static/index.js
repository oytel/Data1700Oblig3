$(function (){
    hentAlle();
});

function hentAlle() {
    $.get( "/hentAlle", function(data) {
        formaterData(data);
    });
}

function validerOgRegistrer(){
    const filmOK = validerFilm($("#velgF").val());
    const antOK = validerAntall($("#antall").val());
    const teleOK = validerTele($("#telefon").val());
    const forNavnOK = validerForNavn($("#fornavn").val());
    const etterNavnOK = validerEtterNavn($("#etternavn").val());
    const epostOK = validerEpost($("#mail").val());

    if(filmOK && antOK && teleOK && forNavnOK && etterNavnOK && epostOK){
        regKjop();
    }
}

function formaterData(kinoKjopene){
    let ut = "<table class='table table-striped'><tr><th>Film</th><th>Antall</th><th>Fornavn</th>" +
        "<th>Etternavn</th><th>Telefonnr</th><th>Epost</th><th></th><th></th></tr>";
    for (const kinoKjop of kinoKjopene) {
        ut += "<tr><td>" + kinoKjop.film + "</td><td>" + kinoKjop.antall + "</td><td>" + kinoKjop.fornavn + "</td>" +
            "<td>" + kinoKjop.etternavn + "</td><td>" + kinoKjop.telefonnr + "</td><td>" + kinoKjop.epost + "</td></tr>";
    }
    ut += "</table>";

    $("#kjop").html(ut);
}

function slettKjop() {
    $.get( "/slettAlle", function() {
        hentAlle();
    });
}

function regKjop() {
    const kunde = {
        film: $("#velgF").val(),
        antall: $("#antall").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        telefonnr: $("#telefon").val(),
        epost: $("#mail").val()

    }
    $.get("/lagre", kunde, function () {
        hentAlle();
    });
    $("#velgF").val("");//tøm input-feltene
    $("#antall").val("");
    $("#fornavn").val("");
    $("#etternavn").val("");
    $("#telefon").val("");
    $("#mail").val("");
}