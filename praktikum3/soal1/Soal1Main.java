package praktikum3.soal1;


import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        //Variabel yang digunakan untuk menhitung total dadu
        int total = 0;
        Scanner keyboard = new Scanner(System.in);
        //Menyimpan obek dadu ke dalam Linked List
        LinkedList<Dadu> cubes = new LinkedList<Dadu>();
        int input = keyboard.nextInt();


        for (int i = 0; i <= input; i++ ) {
            //Menambahkan objek cube baru setiap iterasi perulangan
            cubes.add(new Dadu());
            //Memnaggil metod acaNilai() pada objek dadu terhadap tiap index Linked List
            cubes.getLast().acakNilai();
        }


        for (int i = 1; i < cubes.size(); i++) {
            //Menampilkan output ke layar
            System.out.println("Dadu ke-" + i + " bernilai " + cubes.get(i).getNilai());
            total += cubes.get(i).getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
