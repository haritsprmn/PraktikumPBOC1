package Nomor_1;

// Nama File    : Kucing.java
// Deskripsi    : kelas turunan Anabul yang memiliki atribut bobot dan perilaku kucing.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

public class Kucing extends Anabul {
    private double bobot;

    public Kucing() {
        super("Kucing");
        this.bobot = 0;
    }

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public String Gerak() {
        return getNama() + " bergerak dengan melata.";
    }

    public String Bersuara() {
        return getNama() + " berbunyi meong.";
    }

    public void tampilData() {
        System.out.println("Nama: " + getNama());
        System.out.println("Bobot: " + bobot + " kg");
        System.out.println(Gerak());
        System.out.println(Bersuara());
    }

    @Override
    public String toString() {
        return getNama() + " (" + bobot + " kg)";
    }
}
