package Kolokwium1;

public class DZ_Newton {
    public static void main(String[] args) {
        int N = 5;
        int K = 4;
        System.out.println(nNadK(N,K));
    }

    static int nNadK (int n, int k) {
        if (k == 0 || k == n) return 1;
        else {
            return nNadK(n-1,k-1) + nNadK(n-1,k);
        }
    }
}
