package KolokwiumTest;

import java.util.Random;

public class PoleFigury1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int pole = 0;

        for (int i = 0; i < 100; i++) {
            double x = rand.nextInt(701)/1000.0;
            double y = rand.nextInt(701)/1000.0 + 0.4;
            System.out.println("x: " + x + "\ty: " + y);
            if (y <= Math.pow(x/10, x)) pole++;

        }

        System.out.println("POLE: " + pole/100.0);
    }
}
