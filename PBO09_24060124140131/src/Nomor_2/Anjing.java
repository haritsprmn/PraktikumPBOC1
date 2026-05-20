// Nama File    : Anjing.java
// Deskripsi    : kelas turunan Anabul untuk objek anjing.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

package Nomor_2;

public class Anjing extends Anabul {
    public Anjing(String panggilan) {
        super(panggilan);
    }

    @Override
    public String gerak() {
        return getNama() + " bergerak dengan melata.";
    }

    @Override
    public String bersuara() {
        return getNama() + " berbunyi guk-guk.";
    }
}
