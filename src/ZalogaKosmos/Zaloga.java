package ZalogaKosmos;

public class Zaloga {
    public static void main(String[] args) {
        int[][] cosmonauts = { //Tabela umiejetnosci wiersze-kosmonauci; kolumny-dziedziny
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        int N = 5; //ilosc kosmonautow
        int D = 4; //ilosc dziedzin
        int[] tab = new int[N+1];
        int s = (int)Math.pow(2,N);

        int[] bestShip = new int[N];
        int bestCounter = N;

        for (int l=0; l<s; l++) {
            int[] status = new int[D];
            int counter = 0;
            boolean everything = true;
            for (int i=0; i<N;i++) {
                if (tab[i]==1) {
                    counter++;
                    for (int j=0;j<D;j++) {
                        if (status[j]==0 && cosmonauts[i][j]==1) {
                            status[j]=1;
                        }
                    }
                }
            }

            for (int i = 0; i<D; i++) {
                if (status[i]==0) {
                    everything = false;
                    break;
                }
            }

            if (everything && (bestCounter >= counter)) {
                System.arraycopy(tab,0,bestShip,0,N);
                bestCounter = counter;
            }

            int i=0;
            do {
                if (tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);

        }

        System.out.println("Najlepiej, aby polecieli: ");
        for (int i=0;i<N;i++) {
            if (bestShip[i]==1) System.out.println("Kosmonauta nr " + (i+1));
        }

    }
}



