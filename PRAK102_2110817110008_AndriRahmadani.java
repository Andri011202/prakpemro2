package praktikum.pertama;

import java.util.Scanner;

public class PRAK102_2110817110008_AndriRahmadani {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        int input = keyboard.nextInt();

        while (i <= 6) {
            int t;
            //Jika deteret habis dibagi dua
            if (input % 2 == 0) {
                //harus dibagi 2 kemudian dikurangi 1,
                t = (input / 2) -1;
                System.out.print(" " + t + " ");
            } else {
                System.out.print(input);
            }
            input++;
            i++;
        }
        keyboard.close();
    }
}
