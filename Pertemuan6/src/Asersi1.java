/*  Nama File   : Asersi1.java 
    Deskripsi   : program untuk menunjukkan asersi
    Pembuat     : Harits Permana
    Tanggal     : 16 - 04 - 2026
*/

// package Pertemuan6;

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert(x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
