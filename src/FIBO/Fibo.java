package FIBO;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        System.out.println("Podaj dlugość ciągu fibo");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        System.out.println(fibo(liczba));
    }

    static int fibo(int n) {
        if(n == 1 || n == 2) return 1;
        else  return fibo(n-1) + fibo(n-2);
    }
}
