package PRAK203_2110817110008_AndriRahmadani;

//class Employee di ganti menjadi
//public class Employee{
public class Pegawai {
    public String nama;
    /*Pada baris ini terjadi error karena tipe data yang salah, harusnya menggunakan String
    karena lebih dari 1 karakter
     */
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }
    //Pada baris ini terjadi error karena parameter pada setter belum ada, maka harus ditambahkan terlebih dahulu
    //public void setJabatan() {
    //    this.jabatan = j;
    //}
    public void setJabatan(String jabatan) {
        //Pada baris ini terjadi eror karena, nama deklerasi tidak sesuai dengan nama parameter
        //this.jabatan = j;
        this.jabatan = jabatan;
    }
}
