// Nama File    : Kucing.java
// Deskripsi    : kelas turunan Anabul untuk objek keluarga kucing dengan atribut bobot.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

package Nomor_2;

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public String gerak() {
        return getNama() + " bergerak dengan melata.";
    }

    @Override
    public String bersuara() {
        return getNama() + " berbunyi meong.";
    }
}
