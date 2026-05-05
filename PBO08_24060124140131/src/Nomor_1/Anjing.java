package Nomor_1;

// Nama File    : Anjing.java
// Deskripsi    : kelas turunan Anabul yang mendefinisikan perilaku gerak dan suara anjing.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

public class Anjing extends Anabul {
    public Anjing() {
        super("Anjing");
    }

    public Anjing(String nama) {
        super(nama);
    }

    public String Gerak() {
        return getNama() + " bergerak dengan melata.";
    }

    public String Bersuara() {
        return getNama() + " berbunyi guk-guk.";
    }
}
