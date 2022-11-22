package Reszta_Algorytm_Zachlanny;

import java.util.Scanner;

public class WydawanieReszty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nominalyArr = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] iloscArr = {3, 3, 5, 12, 12, 7, 11, 16, 32};
        int resztaZL, resztaGR, reszta, i = 0;
        int[] sumaArr = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        double sumaKasa = 0;

        for (int j = 0; j < nominalyArr.length; j++) {
            sumaKasa += nominalyArr[j] / 100.0 * iloscArr[j];
        }


        System.out.println("W kasie jest: " + sumaKasa + "zł");
        System.out.println("Podaj resztę");
        System.out.println("Zł: ");
        resztaZL = input.nextInt();
        System.out.println("Gr: ");
        resztaGR = input.nextInt();

        reszta = resztaZL * 100 + resztaGR;
        if (sumaKasa * 100 < reszta) System.out.println("Za mało pieniędzy w kasie");
        else {
            while (reszta > 0) {
                if (reszta >= nominalyArr[i] && iloscArr[i] > 0) {
                    System.out.println(nominalyArr[i] / 100.0 + " ");
                    reszta = reszta - nominalyArr[i];
                    sumaArr[i]++;
                    iloscArr[i]--;
                } else i++;


            }
            System.out.println("zostalo: " + reszta);
            System.out.println("Wydano w sztukach:\n" +
                    "5zł: " + sumaArr[0] + "\n" +
                    "2zł: " + sumaArr[1] + "\n" +
                    "1zł: " + sumaArr[2] + "\n" +
                    "50gr: " + sumaArr[3] + "\n" +
                    "20gr: " + sumaArr[4] + "\n" +
                    "10gr: " + sumaArr[5] + "\n" +
                    "5gr: " + sumaArr[6] + "\n" +
                    "2gr: " + sumaArr[7] + "\n" +
                    "1gr: " + sumaArr[8] + "\n");
        }
    }
}
