package Nomor_3;

// Nama File    : Anabul.java
// Deskripsi    : kelas abstrak induk untuk hewan anabul dengan method gerak dan bersuara.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public abstract class Anabul {
    private String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract String Gerak();

    public abstract String Bersuara();
}
