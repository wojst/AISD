package KolokwiumTest;

import java.util.Scanner;

public class Reszta1 {

    final static int[] monetyArr = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    static int[] iloscMonetArr = {7, 0, 1, 1, 4, 1, 4, 7, 30};
    static double sumaKasa = 0;

    public static void main(String[] args) {
        //obliczanie sumy w kasie
        for (int j = 0; j < monetyArr.length; j++) {
            sumaKasa += (monetyArr[j]/100.0) * iloscMonetArr[j];
        }
        System.out.println("W kasie jest: " + sumaKasa);

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz ile jest reszty do wydania:\nZł: ");
        int zl = input.nextInt();
        System.out.println("Gr: ");
        int gr = input.nextInt();

        int reszta = zl * 100 + gr;

        if (reszta/100.0 > sumaKasa) System.out.println("Za mało pieniędzy w kasie. Nie można wydać reszty");
        int i = 0;

        while (reszta > 0) {
            if (reszta >= monetyArr[i] && iloscMonetArr[i] > 0) {
                reszta = reszta - monetyArr[i];
                iloscMonetArr[i]--;
                System.out.println(monetyArr[i]/100.0);
            }
            else i++;
        }

    }
}
