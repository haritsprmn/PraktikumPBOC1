package Nomor_4;

// Nama File    : Dosen.java
// Deskripsi    : kelas turunan Civitasakademika untuk menyimpan data dosen dan NIP.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class Dosen extends Civitasakademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}
