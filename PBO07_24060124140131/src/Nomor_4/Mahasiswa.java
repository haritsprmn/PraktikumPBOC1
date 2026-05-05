package Nomor_4;

// Nama File    : Mahasiswa.java
// Deskripsi    : kelas turunan Civitasakademika untuk menyimpan data mahasiswa, NIM, dan dosen wali.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class Mahasiswa extends Civitasakademika {
    private String nim;
    private Dosen dosenwali;

    public Mahasiswa(String nama, String nim, Dosen dosenwali) {
        super(nama);
        this.nim = nim;
        this.dosenwali = dosenwali;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Dosen getDosenwali() {
        return dosenwali;
    }

    public void setWali(Dosen dosenwali) {
        this.dosenwali = dosenwali;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + getNim());
        System.out.println("Nama Mahasiswa: " + getNama());
        System.out.println("Nama Dosenwali: " + dosenwali.getNama());
    }
}
