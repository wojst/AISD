package KolokwiumTest;

import java.util.Random;

public class PoleFigury2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int pole = 0;

        for (int i = 0; i < 200; i++) {
            double x = rand.nextInt(1001)/1000.0;
            double y = rand.nextInt(1001)/1000.0;
            System.out.println("x: " + x + "\ty: " + y);
            if (y <= Math.sqrt(x)) pole++;
        }
        System.out.println("Pole: " + pole/200.0);
    }
}
