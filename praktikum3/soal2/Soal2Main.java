package praktikum3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        String jenis_kepemimpinan;

        //Hashmap untuk menyimpan data bulan
        HashMap<Integer, String> bulan = new HashMap<Integer, String>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");

        //Linked list untuk menyimpan objek negara
        LinkedList<Negara> negara = new LinkedList<Negara>();

        keyboard.nextLine();
        //Perulangan untuk setiap nilai yang diinput
        for (int i = 0; i < input; i++) {
            //Input semua data tiap iterasi perulangan
            //Nama negara
            String nama_negara = keyboard.nextLine();
            //Jenis kepemimpinan
            jenis_kepemimpinan = keyboard.nextLine();

            //Pengondisian jika jenis kepemimpinan adalah monarki
            if (jenis_kepemimpinan.equalsIgnoreCase("Monarki")) {
                //Nama Pemimpin: ");
                String nama_pemimpin = keyboard.nextLine();
                //Objek negara dengan method monarki
                negara.add(new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin));
            //Jika bukan monarki
            } else {
                //Nama Pemimpin: ");
                String nama_pemimpin = keyboard.nextLine();
                //"tanggal kemerdekaan: ");
                int tanggal_kemerdekaan = keyboard.nextInt();
                //bulan kemerdekaan: ");
                int bulan_kemerdekaan = keyboard.nextInt();
                bulan.get(bulan_kemerdekaan);
                //tahun kemerdekaan: ");
                int tahun_kemerdekaan = keyboard.nextInt();
                keyboard.nextLine();
                negara.add(new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin, tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan));

            }
        }
        System.out.println();

        //Perulangan untuk tiap index yang ada di Linked List,
        for (int j = 0; j < negara.size(); j++) {
            System.out.println();
            //Menampilkan output dengan kondisi jenis kepemimpinan adalah monarki
             if (negara.get(j).getJenis_kepemimpinan().equalsIgnoreCase("Monarki")) {
                 negara.get(j).setJenis_kepemimpinan("Raja");
                System.out.println("Negara " + negara.get(j).getNama() + " mempunyai " + negara.get(j).toTitleCase(negara.get(j).getJenis_kepemimpinan()) + " bernama " + negara.get(j).getNama_pemimpin());
            } else {
                ////Menampilkan output dengan kondisi selain jenis kepemimpinan adalah monarki
                System.out.println("Negara " + negara.get(j).getNama() + " mempunyai " + negara.get(j).toTitleCase(negara.get(j).getJenis_kepemimpinan()) + " bernama " + negara.get(j).getNama_pemimpin());
                System.out.println("Deklerasi kemerdekaan pada Tanggal " + negara.get(j).getTanggal_kemerdekaan() + " " + bulan.get(negara.get(j).getBulan_kemerdekaan()) + " " + negara.get(j).getTahun_kemerdekaan());
            }
        }
    }
}
