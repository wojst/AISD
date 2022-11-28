package KolokwiumTest;

public class Komary {
    public static void main(String[] args) {
        double samce = 450;
        double samice = 550;
        double populacja = samce + samice;

        double[] samceArr = new double[50];
        double[] samiceArr = new double[50];
        double[] noweSamceArr = new double[50];
        double[] noweSamiceArr = new double[50];
        double[] deadSamceArr = new double[50];
        double[] deadSamiceArr = new double[50];

        int tydzien;



        for (tydzien = 0; samce < samice; tydzien++) {
            samceArr[tydzien] = samce;
            samiceArr[tydzien] = samice;
            noweSamceArr[tydzien] = (populacja*0.1)*0.45;
            noweSamiceArr[tydzien] = (populacja*0.1)*0.55;
            deadSamceArr[tydzien] = samceArr[tydzien]*0.02;
            deadSamiceArr[tydzien] = samiceArr[tydzien]*0.05;

            samce = samceArr[tydzien] + noweSamceArr[tydzien] - deadSamceArr[tydzien];
            samice = samiceArr[tydzien] + noweSamiceArr[tydzien] - deadSamiceArr[tydzien];
            populacja = samce + samice;

            System.out.println("Tydzien "+ (tydzien+1) + ":" + "\tSamce: " + Math.floor(samce) + "\tSamice: " + Math.floor(samice) + "\tPopulacja: " + Math.floor(populacja));

        }

        if (samce >= samice) System.out.println("W tygodniu " + (tydzien) + " populacja samców stała się liczniejsza od populacji samic. Cała populacja wynosi: " + Math.floor(populacja));
    }
}
