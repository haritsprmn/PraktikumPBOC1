// Nama File    : Burung.java
// Deskripsi    : kelas turunan Anabul untuk objek burung.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

package Nomor_2;

public class Burung extends Anabul {
    public Burung(String panggilan) {
        super(panggilan);
    }

    @Override
    public String gerak() {
        return getNama() + " bergerak dengan terbang.";
    }

    @Override
    public String bersuara() {
        return getNama() + " berbunyi cuit.";
    }
}
