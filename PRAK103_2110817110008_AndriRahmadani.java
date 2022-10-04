package praktikum.pertama;

import java.util.Scanner;

public class PRAK103_2110817110008_AndriRahmadani {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int input = keyboard.nextInt();
        int i = 1;
        do {
            //Pengondisian apabila deret habis dibagi 7
            if (input % 7 == 0) {
                //Akan mengabaikan dan kembali ke atas
                continue;
            }
            if (i == 5) System.out.print(input);
            else System.out.print(input + ", ");
            i++;
            input--;
        } while (i<=5);
    }
}
