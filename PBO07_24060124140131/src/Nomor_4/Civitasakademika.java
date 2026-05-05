package Nomor_4;

// Nama File    : Civitasakademika.java
// Deskripsi    : kelas abstrak induk civitas akademika dengan atribut nama dan fungsi getNomor.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public abstract class Civitasakademika {
    private String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract String getNomor();
}
