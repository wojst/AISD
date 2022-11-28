package Kolokwium1;

import java.util.Random;

public class MC_Figura {
    public static void main(String[] args) {
        Random los = new Random();

        int licz = 0;

        for (int i = 0; i < 100; i++) {
            double x = los.nextInt(1001)/1000.0;
            double y = los.nextInt(1001)/1000.0;
            System.out.println(x + " " + y);
            if (y<=Math.sin(x)) licz++;
        }

        System.out.println("POLE: " + (licz/100.0));

    }
}
