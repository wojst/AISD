package Problem_Plecakowy;

public class ProblemPlecakowyDec {
    public static void main(String[] args) {
        int[] V = {6, 2, 3, 2, 3, 1}; //objetosci przedmiotow
        int[] W = {6, 4, 5, 7, 10, 2}; // wartosci przedmiotow
        final int maxV = 10;            // pojemnosc plecaka
        int wartoscPlecaka =0;
        int v, w;
        w = 0;

        int[] tab = new int[6];

        for (int p1 = 0; p1 <= 1; p1++) {
            for (int p2 = 0; p2 <= 1; p2++) {
                for (int p3 = 0; p3 <= 1; p3++) {
                    for (int p4 = 0; p4 <= 1; p4++) {
                        for (int p5 = 0; p5 <= 1; p5++) {
                            for (int p6 = 0; p6 <= 1; p6++) {
                            v = p1 * V[0] + p2 * V[1] + p3 * V[2] + p4 * V[3] + p5 * V[4] + p6 * V[5];
                            if (v <= maxV) {
                                w = p1 * W[0] + p2 * W[1] + p3 * W[2] + p4 * W[3] + p5 * W[4] + p6 * W[5];
                            }
                            if (w > wartoscPlecaka) {
                                wartoscPlecaka = w;
                                tab[0] = p1;
                                tab[1] = p2;
                                tab[2] = p3;
                                tab[3] = p4;
                                tab[4] = p5;
                                tab[5] = p6;
                            }
                            }
                        }
                    }

                }
            }
        }

        System.out.println("Wartosc maksymalna plecaka wynosi " + wartoscPlecaka);
        System.out.println("Przedmioty ktore weszly w sklad tego plecaka to:" );
        for (int i = 0; i < 6; i++) {
            if (tab[i] == 1) System.out.print(i + " ");
        }
    }

}
