package com.Praktikum4.Soal1;

//Class parent buku
public class Buku {
    private String Judul;
    private String Penulis;
    private int Tahun;

    //Setter dan Getter
    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String penulis) {
        Penulis = penulis;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int tahun) {
        Tahun = tahun;
    }

    public Buku(String j, String p, int t) {
        Judul = j;
        Penulis = p;
        Tahun = t;
    }

    //Method untuk menampilkan output di layar
    public void Display() {
        System.out.printf("Detail buku:\n" +
                "Judul adalah %s \n" +
                "Penulis adalah Budi Utomo %s\n" +
                "Tahun Terbit adalah %d\n",Judul,Penulis,Tahun);
    }
}
