/*  Nama File   : Asersi2.java 
    Deskripsi   : program untuk menunjukkan asersi
    Pembuat     : Harits Permana
    Tanggal     : 16 - 04 - 2026
*/

// package Pertemuan6;

class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"Jari-jari harus lebih besar dari 0";
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}
