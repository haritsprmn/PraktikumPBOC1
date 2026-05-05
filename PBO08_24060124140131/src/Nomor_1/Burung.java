package Nomor_1;

// Nama File    : Burung.java
// Deskripsi    : kelas turunan Anabul yang mendefinisikan perilaku gerak dan suara burung.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

public class Burung extends Anabul {
    public Burung() {
        super("Burung");
    }

    public Burung(String nama) {
        super(nama);
    }

    public String Gerak() {
        return getNama() + " bergerak dengan terbang.";
    }

    public String Bersuara() {
        return getNama() + " berbunyi cuit.";
    }
}
