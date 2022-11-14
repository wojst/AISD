package OdgadywanieLiczb;

import java.util.Random;

public class Odgadnij {

     public static void main(String[] args) {
          Random random = new Random();
          int min = 0;
          int max = 1000;
          int N = random.nextInt(max - min + 1) + min;
          System.out.println("Szukana liczba to: " + N);
          szukanie(min, max, N);

     }

     static void szukanie(int min, int max, int N) {
          int p = (min + max) / 2;
          if (p == N) System.out.println("Program wybrał " + p + "\nOdp: Zgadłeś");
          else if (N < p)  {
               System.out.println("Program wybrał " + p);
               System.out.println("Odp: Za duża");
               szukanie(min, p, N);
          }
          else {
               System.out.println("Program wybrał " + p);
               System.out.println("Odp: Za mala");
               szukanie(p, max, N);
          }

     }
}
