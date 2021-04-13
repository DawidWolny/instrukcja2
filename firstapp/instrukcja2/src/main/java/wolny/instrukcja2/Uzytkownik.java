package wolny.instrukcja2;

public class Uzytkownik{

    String imie;
    String nazwisko;
    int wiek;
    String dataDolaczenia;
    double gotowka;
    boolean status;


    public Uzytkownik( String imie, String nazwisko, int wiek, String dataDolaczenia, double gotowka, boolean status) {
        this.imie           = imie;
        this.nazwisko       = nazwisko;
        this.wiek           = wiek;
        this.dataDolaczenia = dataDolaczenia;
        this.gotowka        = gotowka;
        this.status         = status;

    }
}
