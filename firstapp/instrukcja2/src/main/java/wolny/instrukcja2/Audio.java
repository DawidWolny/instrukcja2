package wolny.instrukcja2;

public class Audio extends przedmiot {
    int rozmiarpliku;
    int dlugoscNagrania;

    public Audio( String nrKatalogowy, String dataWydania, String Autor, String Wydawnictwo, String Cena, int rozmiarpliku, int dlugoscNagrania, boolean wypozyczone, int przekroczonyCzasWypozyczenia)
    {
        super(nrKatalogowy, dataWydania, Autor, Wydawnictwo, Cena, wypozyczone, przekroczonyCzasWypozyczenia);
        this.rozmiarpliku = rozmiarpliku;
        this.dlugoscNagrania = dlugoscNagrania;
    }

}
