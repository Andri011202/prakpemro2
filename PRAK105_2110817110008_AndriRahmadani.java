package praktikum.pertama;

import java.util.Scanner;

public class PRAK105_2110817110008_AndriRahmadani {
    public static void main(String[] args) {
        //Konstanta PHI
        final float PHI = 3.14f;

        /* Variable:
        r untuk jari-jari
        t untuk tinggi dan volume
         */
        float r, t, volume;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("=====INPUT=====");
        System.out.print("Masukan jari-jari \t : ");
        r = keyboard.nextFloat();

        System.out.print("Masukan tinggi \t\t : ");
        t = keyboard.nextFloat();

        //Rumus volume tabung
        volume = PHI * r * r * t;

        //Output
        System.out.println("=====OUTPUT=====");
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3",r,t,volume);
    }
}
