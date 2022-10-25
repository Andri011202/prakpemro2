package praktikum3.soal2;

public class Negara {
    //Encapsulasi modifier private pada atribut
    //Deklerasi properties
    private String nama, jenis_kepemimpinan, nama_pemimpin;

    private int tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan;


    //Constructor untuk jenis kepimpinan selain monarki
    public Negara(String nama, String jenis_kepemimpinan, String nama_pemimpin, int tanggal_kemerdekaan, int bulan_kemerdekaan, int tahun_kemerdekaan) {
        this.nama = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
        this.tanggal_kemerdekaan = tanggal_kemerdekaan;
        this.bulan_kemerdekaan = bulan_kemerdekaan;
        this.tahun_kemerdekaan = tahun_kemerdekaan;
    }

    //Constructor untuk monarki
    public Negara(String nama, String jenis_kepemimpinan, String nama_pemimpin) {
        this.nama = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
    }

    //Getter untuk properties nama untuk diakses di luar classs
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    //Method untuk mengubah huruf kecil menjadi huruf besar cth: perdana mentri menjadi Perdana Mentri
    public String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }

    //Getter dan Setter untuk atribut
    public String getJenis_kepemimpinan() {
        return jenis_kepemimpinan;
    }

    public void setJenis_kepemimpinan(String jenis_kepemimpinan) {
        this.jenis_kepemimpinan = jenis_kepemimpinan;
    }

    public String getNama_pemimpin() {
        return nama_pemimpin;
    }

    public void setNama_pemimpin(String nama_pemimpin) {
        this.nama_pemimpin = nama_pemimpin;
    }

    public int getTanggal_kemerdekaan() {
        return tanggal_kemerdekaan;
    }

    public void setTanggal_kemerdekaan(int tanggal_kemerdekaan) {
        this.tanggal_kemerdekaan = tanggal_kemerdekaan;
    }

    public int getBulan_kemerdekaan() {
        return bulan_kemerdekaan;
    }

    public void setBulan_kemerdekaan(int bulan_kemerdekaan) {
        this.bulan_kemerdekaan = bulan_kemerdekaan;
    }

    public int getTahun_kemerdekaan() {
        return tahun_kemerdekaan;
    }

    public void setTahun_kemerdekaan(int tahun_kemerdekaan) {
        this.tahun_kemerdekaan = tahun_kemerdekaan;
    }
}
