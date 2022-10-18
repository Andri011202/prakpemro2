package PRAK201_2110817110008_AndriRahmadani;

public class BuahMangga {
    private String namaMangga;
    private String warna;
    private Double berat;
    private String teksture;
    private String rasa;
    private int jumlahBeli;
    private int harga;

    //Setter dan Getter
    public String getNamaMangga() {
        return namaMangga;
    }

    public void setNamaMangga(String namaMangga) {
        this.namaMangga = namaMangga;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTeksture() {
        return teksture;
    }

    public void setTeksture(String teksture) {
        this.teksture = teksture;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public Double getBerat() {
        return berat;
    }

    public void setBerat(Double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    //cONSTRUCTOR


    public BuahMangga(String namaMangga, String warna, Double berat, String teksture, String rasa, int jumlahBeli, int harga) {
        this.namaMangga = namaMangga;
        this.warna = warna;
        this.berat = berat;
        this.teksture = teksture;
        this.rasa = rasa;
        this.jumlahBeli = jumlahBeli;
        this.harga = harga;
    }

    //Method untuk menghitung total berat
    public Double totalBerat() {
        double total = berat *  jumlahBeli;
        return total;
    }

    //Method untuk menghitung total harga
    public int totalHarga () {
        int totalHarga = jumlahBeli * harga;
        return totalHarga;
    }

    //Menampilkan Display Atribut-atribut mangga
    public void display() {
        System.out.println("Nama Mangga: " + namaMangga);
        System.out.println("Berat: " + berat + "kg");
        System.out.println("Jumlah: " + jumlahBeli);
        System.out.println("Total berat: " + totalBerat() + " Kg");
        System.out.println("Total harga: Rp." + totalHarga());
        System.out.println();
    }
}
