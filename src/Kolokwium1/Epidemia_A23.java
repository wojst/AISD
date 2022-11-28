package Kolokwium1;

public class Epidemia_A23 {
    public static void main(String[] args) {
        int[] zakazeniArr = new int[100];
        int[] wyzdrowialiArr = new int[100];


        int zakazeni = 10;
        int wyzdrowiali = 0;


        zakazeniArr[0] = 10;
        wyzdrowialiArr[0] = 0;
        System.out.println("W dniu 'zero' zarażonych było 10 osób");

        for (int dzien = 1; zakazeni > 0 ; dzien++) {
            if (dzien < 7) {
                wyzdrowialiArr[dzien] = 0;
                zakazeniArr[dzien] = zakazeniArr[dzien - 1] * 3;
            }
            else {
                wyzdrowialiArr[dzien] = zakazeniArr[dzien - 7];
                zakazeniArr[dzien] = zakazeniArr[dzien -1] * 3 - wyzdrowialiArr[dzien];
            }

            zakazeni = zakazeniArr[dzien];
            wyzdrowiali = wyzdrowialiArr[dzien];

            if (wyzdrowiali > 100000) {
                wyzdrowialiArr[dzien] = 100000;
            }

            if(zakazeni > 100000) {
                zakazeniArr[dzien] = 100000 - wyzdrowialiArr[dzien];
                zakazeni = zakazeniArr[dzien];
            }




            System.out.println(dzien + " dzień\nZarażonych: " + zakazeniArr[dzien] + "\nWyzdrowialych: " + wyzdrowialiArr[dzien]);
            System.out.println(zakazeni);
            System.out.println(wyzdrowiali);
            System.out.println();


        }
    }
}
