package wolny.instrukcja2;

public class Plyty extends przedmiot {
    String typPlyty;
    int dlugoscUtworu;

    public Plyty( String nrKatalogowy, String dataWydania, String Autor, String Wydawnictwo, String Cena, String typPlyty, int dlugoscUtworu, boolean wypozyczone, int przekroczonyCzasWypozyczenia)
    {
        super(nrKatalogowy, dataWydania, Autor, Wydawnictwo, Cena, wypozyczone, przekroczonyCzasWypozyczenia);
        this.typPlyty = typPlyty;
        this.dlugoscUtworu = dlugoscUtworu;
    }

}
