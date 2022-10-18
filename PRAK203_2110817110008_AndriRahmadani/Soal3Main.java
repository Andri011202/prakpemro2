package PRAK203_2110817110008_AndriRahmadani;

public class Soal3Main {
    public static void main(String[] args) {
            /*Pada baris ini terjadi error karena inisilasisi objek salah harusnya Employee menjadi Pegawai sesuai
            Dengan class Pegawai
            Employee p1 = new Employee(); */
            Pegawai p1 = new Pegawai();

            //Pada baris ini terjadi error karena tidak ada titik koma  harusnya:
            //p1.nama = "Roi"
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";

            //Mengedit properties umur
            p1.umur = 17;
            //Pada baris ini terjadi error karena di dalam class pegawai pada file setter jabatan
            p1.setJabatan("Assasin");
            System.out.println("Nama Pegawai: " + p1.getNama());
            System.out.println("Asal: " + p1.getAsal());
            System.out.println("Jabatan: " + p1.jabatan);
            //Menambahkan kata tahun di depan properties umur
            System.out.println("Umur: " + p1.umur + " Tahun");
    }
}
