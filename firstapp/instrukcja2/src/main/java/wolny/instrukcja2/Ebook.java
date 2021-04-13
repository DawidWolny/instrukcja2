package wolny.instrukcja2;

public class Ebook extends przedmiot {
    int rozmiarPliku;
    int iloscstron;

    public Ebook( String nrKatalogowy, String dataWydania, String Autor, String Wydawnictwo, String Cena, int rozmiarPliku, int iloscstron, boolean wypozyczone, int przekroczonyCzasWypozyczenia)
    {
        super(nrKatalogowy, dataWydania, Autor, Wydawnictwo, Cena, wypozyczone, przekroczonyCzasWypozyczenia);
        this.rozmiarPliku = rozmiarPliku;
        this.iloscstron = iloscstron;
    }

}
