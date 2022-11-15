package com.Praktikum4.Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("=====INPUT=====");
        System.out.print("Judul: ");
        String Judul = input.nextLine();
        System.out.print("Penulis: ");
        String Penulis = input.nextLine();
        System.out.print("Tahun Terbit: ");
        int Tahun = input.nextInt();

        //Inisialisasi Objek
        Buku books = new Buku(Judul, Penulis, Tahun);

        System.out.println();
        System.out.println("=====OUTPUT=====");
        books.Display();

    }
}
