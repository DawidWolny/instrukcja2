package wolny.instrukcja2;

public class przedmiot {

    String nrKatalogowy;
    String dataWydania;
    String Autor;
    String Wydawnictwo;
    String Cena;
    boolean wypozyczone;
    int przekroczonyCzasWypozyczenia;

    public przedmiot( String nrKatalogowy, String dataWydania, String Autor, String Wydawnictwo, String Cena, boolean wypozyczone, int przekroczonyCzasWypozyczenia) {
        this.nrKatalogowy   = nrKatalogowy;
        this.dataWydania    = dataWydania;
        this.Autor          = Autor;
        this.Wydawnictwo    = Wydawnictwo;
        this.Cena           = Cena;
        this.wypozyczone    = wypozyczone;
        this.przekroczonyCzasWypozyczenia = przekroczonyCzasWypozyczenia;
    }
}
