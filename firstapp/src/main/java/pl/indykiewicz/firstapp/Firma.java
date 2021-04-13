package pl.indykiewicz.firstapp;

public class Firma
{
    public static void main(String[] args) {

        Pracownik Janusz = new Pracownik();

        Janusz.Imie = "Janusz";
        Janusz.Nazwisko = "Kowalski";
        Janusz.Wiek = 32;

        Pracownik Jan = new Pracownik();

        Jan.Imie = "Jan";
        Jan.Nazwisko = "Kopacz";
        Jan.Wiek = 56;

        System.out.println("W firmie pracuje: "+Jan.Imie+" "+Jan.Nazwisko+" w wieku "+Jan.Wiek);
        System.out.println("W firmie pracuje: "+Janusz.Imie+" "+Janusz.Nazwisko+" w wieku "+Janusz.Wiek);

    }
    }



