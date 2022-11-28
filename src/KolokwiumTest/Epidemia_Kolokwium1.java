package KolokwiumTest;

public class Epidemia_Kolokwium1 {

    public static void main(String[] args) {
        int[] zarazeniArr = new int[50];
        int[] wyzdrowialiArr = new int[50];

        int zarazeni = 10;
        int wyzdrowiali = 0;

        zarazeniArr[0] = 0; //zarazeni 0 dnia
        wyzdrowialiArr[0] = 0; //wyzdrowiali 0 dnia
        zarazeniArr[1] = 10;
        wyzdrowialiArr[1] = 0;

        System.out.println("W dniu 1 jest:\nZarażonych: " + zarazeniArr[1] + "\nWyzdrowialych: " + wyzdrowialiArr[1]);

        for (int dzien = 2; zarazeni < 100000 ; dzien++) {
            if (dzien < 7) {
                wyzdrowialiArr[dzien] = 0;
                zarazeniArr[dzien] = ((zarazeniArr[dzien-1]/2)*3 + zarazeniArr[dzien-1]/2) - wyzdrowialiArr[dzien];
                zarazeni = zarazeniArr[dzien];
                wyzdrowiali = wyzdrowialiArr[dzien];
            }
            else {
                wyzdrowialiArr[dzien] = zarazeniArr[dzien-7];
                zarazeniArr[dzien] = ((zarazeniArr[dzien-1]/2)*3 + zarazeniArr[dzien-1]/2) - wyzdrowialiArr[dzien];
                zarazeni = zarazeniArr[dzien];
                wyzdrowiali = wyzdrowialiArr[dzien];
            }

            System.out.println("W dniu " + dzien + " jest:\nZarazonych: " + zarazeniArr[dzien] + "\nWyzdrowialych: " + wyzdrowialiArr[dzien]);
            System.out.println();

        }
    }

}
