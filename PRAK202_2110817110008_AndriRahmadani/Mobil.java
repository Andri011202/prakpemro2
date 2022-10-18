package PRAK202_2110817110008_AndriRahmadani;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class Mobil {
    //Atrbut pada class mbil
    public String merek;
    public String tahun_keluaran;
    public int kapasitas;
    public int harga;
    private String pemilik;
    private int pajak;



    //Menampilkan output ke konsol
    public void info() {
        //code khusus untuk  format penulisan uang Rupiah
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        //Print output di layar
        System.out.println("Merek Mobil: " + merek);
        System.out.printf("Hargaa: %s %n", kursIndonesia.format(harga));
        System.out.println("Tahun Keluaran : " + tahun_keluaran);
        System.out.println("Kapasitas : " + kapasitas +"cc");
    }

    //pada atribut pemilik dan pajak, bermodifier private maka dibuatkan setter dan getternya
    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    //Method untuk operasi pada pajak
    public String getPajak() {
        //code khusus untuk  format penulisan uang Rupiah
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        //perhitungan pajak
       int pajak = (harga*2)/100;
       return kursIndonesia.format(pajak);

    }

    public void setPajak(int pajak) {
        this.pajak = pajak;
    }
}
