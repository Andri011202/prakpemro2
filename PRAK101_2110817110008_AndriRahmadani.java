package praktikum.pertama;
import java.util.Scanner;

public class PRAK101_2110817110008_AndriRahmadani {
    public static void main(String[] args) {

        //Scanner untuk menerima input dari user
        Scanner keyboard = new Scanner(System.in);

        //Deklerasi Variabel
        String namaLengkap, tempatLahir;
        int tanggalLahir, bulanLahir, tahunLahir;
        float beratBadan, tinggiBadan;
        String namaBulan = null;

        //Input Nama
        System.out.print("Masukan Nama Lengkap: ");
        namaLengkap = keyboard.nextLine();

        //Input Tempat Lahir
        System.out.print("Masukan Tempat Lahir: ");
        tempatLahir = keyboard.nextLine();

        //Input Tempat Tanggal Lahir:
        System.out.print("Masukan Tanggal Lahir: ");
        tanggalLahir = keyboard.nextInt();

        //Input Bulan lahir
        System.out.print("Masukan Bulan Lahir: ");
        bulanLahir = keyboard.nextInt();
        //Logika numerik ke nama bulan
        if (bulanLahir == 1) namaBulan = "Januari";
        else if (bulanLahir == 2) namaBulan = "Februari";
        else if (bulanLahir == 3) namaBulan = "Maret";
        else if (bulanLahir == 4) namaBulan = "April";
        else if (bulanLahir == 5) namaBulan = "Mei";
        else if (bulanLahir == 6) namaBulan = "Juni";
        else if (bulanLahir == 7) namaBulan = "Juli";
        else if (bulanLahir == 8) namaBulan = "Agustus";
        else if (bulanLahir == 9) namaBulan = "September";
        else if (bulanLahir == 10) namaBulan = "Oktober";
        else if (bulanLahir == 11) namaBulan = "November";
        else if (bulanLahir == 12) namaBulan = "Desember";

        //Input Tahun lahir
        System.out.print("Masukan Tahun Lahir: ");
        tahunLahir = keyboard.nextInt();

        //Input Tinggi badan
        System.out.print("Masukan Tinggi badan: ");
        tinggiBadan = keyboard.nextFloat();

        //Input Berat badan
        System.out.print("Masukan Berat badan: ");
        beratBadan = keyboard.nextFloat();

        keyboard.close();

        //Output
        System.out.println("Data Telah Ditambahkan,");
        System.out.println("Nama Lengkap "+ namaLengkap + ", Lahir di "+ tempatLahir + " pada Tanggal " + tanggalLahir +" "+ namaBulan + " "+ tahunLahir +
                "\nTinggi Badan " + tinggiBadan + " cm dan Berat Badan " +beratBadan+ " kilogram");


    }
}
