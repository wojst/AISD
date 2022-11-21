package PlecakDzielZwyciezaj;

import java.util.Arrays;

public class PlecakDzielZwyciezaj {
    final static int N = 6; //liczba przedmiotow
    final static int VPlecaka = 10; //obj plecaka
    final static int[] v = {6, 2, 3, 2, 3, 1}; //obj przedmiotow
    final static int[] w = {6, 4, 5, 7, 10, 2}; //wartosci przedmiotow


    public static void main(String[] args) {
        int[][] tab = new int[N][VPlecaka + 1];

        for (int i = 0; i < VPlecaka + 1; i++) {
            if (v[0] > i) tab[0][i] = 0;
            else tab[0][i] = w[0];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < VPlecaka + 1; j++) {
                if (v[i] > j) tab[i][j] = tab[i - 1][j];
                else tab[i][j] = Math.max(tab[i - 1][j], w[i] + tab[i - 1][j - v[i]]);
            }
        }

        stworzTabelke(tab);
        System.out.println("Największa wartość plecaka to: " + szukajMax(tab));


    }

    public static void stworzTabelke(int[][] tab) {
        System.out.println(Arrays.deepToString(tab).replace("], ", "]\n").replace("[[","[").replace("]]", "]"));
    }
    
    public static int szukajMax(int[][] tab) {
        int maxValue = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < VPlecaka+1; j++) {
                if (tab[i][j] > maxValue) maxValue = tab[i][j];
            }
        }
        return maxValue;
    }

}
