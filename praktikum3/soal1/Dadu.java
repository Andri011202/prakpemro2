package praktikum3.soal1;

import java.lang.Math;
public class Dadu {
    //Enkapsulasi
    //Properties Dadu Private
    private int nilai;

    //Fungso untuk mengacak nilai dengan kembalian nilai Integer
    public int acakNilai () {
        //Megacak nilai menggunakan method .random() pada library Math
        return nilai =  (int) (Math.random()*(6-1+1)+1);
    }

    //Getter properties nilai
    public int getNilai() { 
        return nilai;
    }
}
