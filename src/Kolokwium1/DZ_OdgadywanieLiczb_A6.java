package Kolokwium1;

import java.util.Random;

public class DZ_OdgadywanieLiczb_A6 {
    public static void main(String[] args) {
        final int MIN = 0;
        final int MAX = 1000;

        Random rand = new Random();

        int N = rand.nextInt(MAX+1);
        System.out.println("Wylosowana liczba to " + N);

        szukaj(MIN, MAX, N);

        System.out.println("Ilość prób " + iloscOperacji);

    }

    static int iloscOperacji = 0;

    static void szukaj(int min, int max, int n) {
        int wybranaLiczba = (min + max) / 2;
        iloscOperacji++;
        System.out.println("Program wybrał " + wybranaLiczba);
        if (wybranaLiczba == n) System.out.println("Znaleziono! Szukana liczba to " + wybranaLiczba);
        else if (wybranaLiczba < n) {
            System.out.println("Za mała liczba. Kontynuuje szukanie.\n");
            szukaj(wybranaLiczba, max, n);
        }
        else {
            System.out.println("Za duża liczba. Kontynuuje szukanie.\n");
            szukaj(min, wybranaLiczba, n);
        }
    }
}
