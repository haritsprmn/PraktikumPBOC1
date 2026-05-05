package Nomor_4;

// Nama File    : Seminar.java
// Deskripsi    : kelas aplikator Seminar untuk mengelola registrasi dan daftar peserta seminar.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class Seminar {
    private static final int MAKS_PESERTA = 100;
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    public Seminar() {
        pesertas = new Civitasakademika[MAKS_PESERTA];
        banyakpeserta = 0;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < MAKS_PESERTA) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        } else {
            System.out.println("Registrasi gagal, peserta seminar sudah penuh.");
        }
    }

    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". " + pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int jumlahMahasiswa = 0;

        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlahMahasiswa++;
            }
        }

        return jumlahMahasiswa;
    }

}
