package com.Praktikum4.Soal2;
//Class komik mewarisi class Buku
public class Komik extends Buku {
    private String volume;
    private String sinopsis;

    //Constructor
    public Komik(String j, String p, String t, String v, String s) {
        judul = j;
        penulis = p;
        this.tahun = Integer.parseInt(t);
        this.volume = v;
        this.sinopsis = s;
    }

    //Method untuk mengembalikan string dari atribut
    public String getKomikDetail() {
        return "Sebuah komik dengan judul \""+ this.judul + "\" Komik tersebut dibuat oleh \n"+ this.penulis +
                "dan diterbitkan pada tahun "+ this.tahun +  ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + this.volume+ " buah.\n" +
                "Sinopsis : " + this.sinopsis.substring(0, 64) + "...";
    }
}
