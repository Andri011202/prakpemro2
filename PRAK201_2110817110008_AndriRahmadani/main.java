package PRAK201_2110817110008_AndriRahmadani;

public class main {
    public static void main(String[] args) {
        //Objek buah mangga arumanis
        BuahMangga arumanis = new BuahMangga(
                "Arumanis",
                "hijau kekuning-kuningan,",
                0.3,
                "lembut",
                "manis",
                13,
                5000);
        //Objek buah mangga manalagi
        BuahMangga manalagi = new BuahMangga(
                "Manalagi",
                "hijau",
                0.5,
                "kasar",
                "manis",
                17,
                7500);
        //Objek buah mangga Madu
        BuahMangga madu = new BuahMangga(
                "Madu",
                "Kuning",
                0.375,
                "lembut",
                "manis",
                12,
                6500
        );

        arumanis.display();
        manalagi.display();
        madu.display();
    }
}
