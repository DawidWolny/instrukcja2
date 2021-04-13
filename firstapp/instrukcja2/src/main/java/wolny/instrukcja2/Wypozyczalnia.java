package wolny.instrukcja2;

public class Wypozyczalnia {
    public static void main(String[] args)
    {
        Ksiazki ksiazki         = new Ksiazki( "K001-0F-4" ,  "07-12-1998",  "Imię Nazwisko", "Wydawnictwo",  "15.99 pln",  2,  300,  false, 0);
        Plyty plyty             = new Plyty( "P001-0R-5" ,  "19-02-2005",  "Imię Nazwisko", "Wydawnictwo",  "38.99 pln", "CD", 108,  true, 2);
        Ebook ebook             = new Ebook( "E001-SF-3" ,  "17-12-2017",  "Imię Nazwisko", "Wydawnictwo",  "42.00 pln", 150, 260,  false, 0);
        Audio audiobook         = new Audio( "AB01-SF-3" ,  "29-02-2020",  "Imię Nazwisko", "Wydawnictwo",  "42.00 pln", 400, 400,  false, 0 );
        Filmy filmy             = new Filmy( "F001-SF-3" ,  "11-04-2021",  "Imię Nazwisko", "Wydawnictwo",  "42.00 pln", "Familijny", 145,  true, 2 );
        Uzytkownik uzytkownik   = new Uzytkownik( "Janusz", "Kowalski", 16,  "11-04-2021",  200, true);


        System.out.println();
        System.out.println("Zalogowany użytkownik: " + uzytkownik.imie + " " +uzytkownik.nazwisko);
        System.out.println("Wiek: "                  + uzytkownik.wiek);
        System.out.println("Data dołączenia: "       + uzytkownik.dataDolaczenia);
        System.out.print("Saldo: ");
        gotowka(uzytkownik, ksiazki, ebook, audiobook, plyty, filmy);


        System.out.println();

        System.out.println();
        System.out.println("1. Książki: ");
        System.out.println("numer katalogowy: " + ksiazki.nrKatalogowy);
        System.out.println("data wydania: "     + ksiazki.dataWydania);
        System.out.println("autor: "            + ksiazki.Autor);
        System.out.println("wydawnictwo: "      + ksiazki.Wydawnictwo);
        System.out.println("cena: "             + ksiazki.Cena);
        System.out.println("waga: "             + ksiazki.waga + " Kg");
        System.out.println("ilość stron: "      + ksiazki.iloscStron);
        System.out.print("Wypożyczone: ");      dostepnosc(ksiazki);
        kara(ksiazki);
        System.out.println();

        System.out.println("2. Płyty: ");
        System.out.println("numer katalogowy: " + plyty.nrKatalogowy);
        System.out.println("data wydania: "     + plyty.dataWydania);
        System.out.println("autor: "            + plyty.Autor);
        System.out.println("wydawnictwo: "      + plyty.Wydawnictwo);
        System.out.println("cena: "             + plyty.Cena);
        System.out.println("typ płyty: "        + plyty.typPlyty);
        System.out.println("długość utworu: "   + plyty.dlugoscUtworu + " min");
        System.out.print("Wypożyczone: ");      dostepnosc(plyty);
        kara(plyty);
        System.out.println();
        System.out.println();

        System.out.println("3. Ebooki: ");
        System.out.println("numer katalogowy: " + ebook.nrKatalogowy);
        System.out.println("data wydania: "     + ebook.dataWydania);
        System.out.println("autor: "            + ebook.Autor);
        System.out.println("wydawnictwo: "      + ebook.Wydawnictwo);
        System.out.println("cena: "             + ebook.Cena);
        System.out.println("rozmiar pliku: "    + ebook.rozmiarPliku + " MB");
        System.out.println("ilość stron: "      + ebook.iloscstron);
        System.out.print("Wypożyczone: ");      dostepnosc(ebook);
        kara(ebook);
        System.out.println();

        System.out.println("4. Audiobooki: ");
        System.out.println("numer katalogowy: " + audiobook.nrKatalogowy);
        System.out.println("data wydania: "     + audiobook.dataWydania);
        System.out.println("autor: "            + audiobook.Autor);
        System.out.println("wydawnictwo: "      + audiobook.Wydawnictwo);
        System.out.println("cena: "             + audiobook.Cena);
        System.out.println("rozmiar pliku: "    + audiobook.rozmiarpliku + " MB");
        System.out.println("długość nagrania: " + audiobook.dlugoscNagrania + " min");
        System.out.print("Wypożyczone: ");      dostepnosc(audiobook);
        kara(audiobook);
        System.out.println();

        System.out.println("5. Filmy: ");
        System.out.println("numer katalogowy: " + filmy.nrKatalogowy);
        System.out.println("data wydania: "     + filmy.dataWydania);
        System.out.println("autor: "            + filmy.Autor);
        System.out.println("wydawnictwo: "      + filmy.Wydawnictwo);
        System.out.println("cena: "             + filmy.Cena);
        System.out.println("Gatunek: "          + filmy.gatunekFilmu);
        System.out.println("długość filmu: "    + filmy.dlugoscFilmu + " min");
        System.out.print("Wypożyczone: ");      dostepnosc(filmy);
        kara(filmy);
        System.out.println();

    }

    public static void kara(przedmiot p) {
        int karaPieniezna = 5;
        int c;
        if ((p.wypozyczone) && (p.przekroczonyCzasWypozyczenia > 0)) {
            c = karaPieniezna * p.przekroczonyCzasWypozyczenia;
            System.out.print("Naliczone opłaty za przekroczony czas wypożyczenia: " + c);
        }
    }

    public static void gotowka(Uzytkownik u, Ksiazki k, Ebook e, Audio a, Plyty p, Filmy f){
        int karaPieniezna2 = 5;
        double b;
            b=((u.gotowka)-((k.przekroczonyCzasWypozyczenia*karaPieniezna2)+(p.przekroczonyCzasWypozyczenia*karaPieniezna2)+(a.przekroczonyCzasWypozyczenia*karaPieniezna2)+(e.przekroczonyCzasWypozyczenia*karaPieniezna2)+(f.przekroczonyCzasWypozyczenia*karaPieniezna2)));
            System.out.println(b);
    }

    public static void dostepnosc(przedmiot p){
        if(p.wypozyczone){
            System.out.println("Nie");
        }
        else{
            System.out.println("Tak");
        }
    }












}
