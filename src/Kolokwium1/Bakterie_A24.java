package Kolokwium1;

public class Bakterie_A24 {

    //z 1 bakterii powstaje 2 kolejne (co 2 minuty)


    public static void main(String[] args) {
        int[] bakterieArr = new int[100];

        bakterieArr[0] = 1; // zaczynamy od 1 bakterii
        int sumaBakterii = 1;
        int populacja = 1000;

        for (int i = 1; sumaBakterii < 1000 ; i++) { //i=2minuty
            bakterieArr[i] = bakterieArr[i-1]*3;
            sumaBakterii = bakterieArr[i];
            System.out.println("Bakterie po " + (i*2) + " minutach: " + sumaBakterii);
        }
    }
}
