package Kolokwium1;

import java.util.Scanner;

public class AZ_Reszta_A28 {

    static int[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1};



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zl, gr, reszta, i = 0;

        System.out.println("Podaj ile reszty jest do wypłacenia: ");
        System.out.println("Zł: ");
        zl = input.nextInt();
        System.out.println("Gr: ");
        gr = input.nextInt();

        reszta = zl * 100 + gr;

        while (reszta > 0) {
            if (reszta >= nominaly[i]) {
                reszta -= nominaly[i];
                System.out.println(nominaly[i] / 100.0);
            }
            else i++;
        }


    }
}
