package Kolokwium1;

import java.util.Scanner;

public class Kroliki_A20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        System.out.println("Ile chcesz uzyskać par?");
        int szukanaIloscPar = input.nextInt();

        while (fibonacci(n) < szukanaIloscPar) {
            fibonacci(n);
            System.out.println("Miesiąc: " + n + "\tIlość par:" + fibonacci(n));
            n++;
        }

        System.out.println("Aby osiągnąć " + szukanaIloscPar + " par, potrzebujesz " + n + " miesiecy. Będziesz miał wtedy " + fibonacci(n) + " par");

    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
