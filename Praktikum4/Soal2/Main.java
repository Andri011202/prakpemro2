package com.Praktikum4.Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan:\n" +
                "1 = Novel\n" +
                "2 = Komik");
        System.out.print("Masukan pilihan: ");
        int pilihan = keyboard.nextInt();
        //mencek angka kondisi menggunakan swict case
        switch (pilihan) {
            //1 Untuk novel
            case 1: {
                keyboard.nextLine();
                System.out.println("======INPUT======");
                System.out.print("Judul: ");
                String judul = keyboard.nextLine();
                System.out.print("Penulis: ");
                String penulis = keyboard.nextLine();
                System.out.print("Tahun Terbit: ");
                String tahun = keyboard.nextLine();
                System.out.print("Genre: ");
                String genre = keyboard.nextLine();
                System.out.print("Sinopsis: ");
                String sinopsis = keyboard.nextLine();

                Novel novel = new Novel(judul, penulis, tahun, genre, sinopsis);
                System.out.println();
                System.out.println("======OUTPUT======");
                novel.display();
                System.out.println(novel.getNovelDetail());
                break;
            }

            //2 Untuk Komik
            case 2: {
                keyboard.nextLine();
                System.out.println("======INPUT======");
                System.out.print("Judul: ");
                String judul = keyboard.nextLine();
                System.out.print("Penulis: ");
                String penulis = keyboard.nextLine();
                System.out.print("Tahun Terbit: ");
                String tahun = keyboard.nextLine();
                System.out.print("Volume: ");
                String volume = keyboard.nextLine();
                System.out.print("Sinopsis: ");
                String sinopsis = keyboard.nextLine();

                Komik novel = new Komik(judul, penulis, tahun, volume, sinopsis);
                System.out.println();
                System.out.println("======OUTPUT======");
                novel.display();
                System.out.println(novel.getKomikDetail());
                break;
            }
        }
    }
}
