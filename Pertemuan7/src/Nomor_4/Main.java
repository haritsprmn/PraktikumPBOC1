package Nomor_4;

// Nama File    : Main.java
// Deskripsi    : program utama untuk menguji registrasi seminar, hitung peserta, dan data mahasiswa.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class Main {
    public static void main(String[] args) {
        Seminar seminar = new Seminar();

        Dosen dosen1 = new Dosen("Dr. Budi Santoso", "198001012005011001");
        Dosen dosen2 = new Dosen("Dr. Siti Aminah", "198203152006042002");

        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", "24060123120001", dosen1);
        Mahasiswa mahasiswa2 = new Mahasiswa("Bella", "24060123120002", dosen1);
        Mahasiswa mahasiswa3 = new Mahasiswa("Citra", "24060123120003", dosen1);
        Mahasiswa mahasiswa4 = new Mahasiswa("Dimas", "24060123120004", dosen2);
        Mahasiswa mahasiswa5 = new Mahasiswa("Eka", "24060123120005", dosen2);

        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mahasiswa1);
        seminar.registrasi(mahasiswa2);
        seminar.registrasi(mahasiswa3);
        seminar.registrasi(mahasiswa4);
        seminar.registrasi(mahasiswa5);

        System.out.println("Banyak peserta seminar: " + seminar.countPeserta());
        System.out.println("Banyak peserta mahasiswa: " + seminar.countMahasiswa());
        System.out.println();

        seminar.tampilPeserta();
        System.out.println();

        mahasiswa1.setWali(dosen2);
        mahasiswa1.tampilDataMahasiswa();
    }
}
