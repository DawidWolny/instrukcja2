package wolny.instrukcja2;

public class Filmy extends przedmiot {
    String gatunekFilmu;
    int dlugoscFilmu;

    public Filmy( String nrKatalogowy, String dataWydania, String Autor, String Wydawnictwo, String Cena, String gatunekFilmu, int dlugoscFilmu, boolean wypozyczone, int przekroczonyCzasWypozyczenia)
    {
        super(nrKatalogowy, dataWydania, Autor, Wydawnictwo, Cena, wypozyczone, przekroczonyCzasWypozyczenia);
        this.gatunekFilmu = gatunekFilmu;
        this.dlugoscFilmu = dlugoscFilmu;
    }

}
