package wolny.instrukcja2;

public class Ksiazki extends przedmiot {
    int waga;
    int iloscStron;

    public Ksiazki( String nrKatalogowy, String dataWydania, String Autor, String Wydawnictwo, String Cena, int waga, int iloscStron, boolean wypozyczone, int przekroczonyCzasWypozyczenia)
    {
        super(nrKatalogowy, dataWydania, Autor, Wydawnictwo, Cena, wypozyczone, przekroczonyCzasWypozyczenia);
        this.waga = waga;
        this.iloscStron = iloscStron;
    }

}
