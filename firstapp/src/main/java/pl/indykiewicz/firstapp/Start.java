package pl.indykiewicz.firstapp;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //System.out.println("Hello World");


        //1.
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwszą wartość");
        int a = scan.nextInt();
        System.out.println("Podaj drugą wartość");
        int b = scan.nextInt();
        if (a < 100 ) {System.out.println("temperatura 1: true");}
        if (b < 100 ) {System.out.println("temperatura 2: true");}
*/

        //2
        // Scanner tab = new Scanner(System.in);
/*
        int[] tablica = new int[8];
        tablica[0] = 7;
        tablica[1] = 1;
        tablica[2] = 2;
        tablica[3] = 3;
        tablica[4] = 6;
        tablica[5] = 9;
        tablica[6] = 0;
        tablica[7] = 5;
        for(int i = 0; i<9; i++) {
            if (tablica[i] == 1) {
                {
                    for(int j = 0; j<9; j++) {
                        if (tablica[j] == 2) {

                            for(int k = 0; k<9; k++) {
                                if (tablica[k] == 3) {
                                    System.out.println("true");
                                }
                            }
                        }
                    }

                }
            }
        }
*/


        //3
/*
        Scanner trojkat = new Scanner(System.in);

        System.out.println("Podaj pierwszy bok");
        int a = trojkat.nextInt();
        System.out.println("Podaj drugi bok");
        int b = trojkat.nextInt();
        System.out.println("Podaj trzeci bok");
        int c = trojkat.nextInt();
        int wynik =  ( ((a*a)+(b*b)) - (c*c) );
        if (wynik == 0) System.out.println("Istnieje trójkąt o takich bokach");
*/

        //4
/*
        Scanner p = new Scanner(System.in);
        System.out.println("podaj wysokość");
        int height = p.nextInt();
        for(int w=0; w< height; w++)
        {
            for (int j = 0; j<(w*2)+1; j++)System.out.print("*");
            System.out.println(" ");

        }
*/



        //5
/*
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] tab2 = new int[tab.length];
        for (int i = 0; i < tab.length; i++)
        {
            tab2[tab.length-i-1] = tab[i];
        }
            System.out.println("");
        for(int j = 0; j<tab.length; j++)
        {
            System.out.print(tab2[j]);

        }
            System.out.println("");
        }

    }

*/

    }
}

