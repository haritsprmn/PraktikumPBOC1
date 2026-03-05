// Nama File    : MMahasiswa.java
// Deskripsi    : Berisi implementasi method
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 5/03/2026

public class MMahasiswa {
    public static void main(String[] args) {

        // Membuat objek Mahasiswa dengan konstruktor parameter
        Mahasiswa m1 = new Mahasiswa("221001", "Andi", "Informatika");

        // Menggunakan getter
        System.out.println("NIM: " + m1.getNim());
        System.out.println("Nama: " + m1.getNama());
        System.out.println("Prodi: " + m1.getProdi());

        // Menggunakan setter
        m1.setNama("Andi Saputra");
        m1.setProdi("Teknik Informatika");

        System.out.println("\nData setelah diubah:");
        m1.printMahasiswa();

        // Membuat objek Dosen
        Dosen d1 = new Dosen("19876", "Dr. Budi", "Informatika");
        m1.setDosenWali(d1);

        // Menggunakan getter dosen wali
        System.out.println("\nDosen Wali:");
        m1.getDosenWali().printDosen();

        // Membuat objek Kendaraan
        Kendaraan k1 = new Kendaraan("B1234CD", "motor");
        m1.setKendaraan(k1);

        // Menggunakan getter kendaraan
        System.out.println("\nKendaraan Mahasiswa:");
        m1.getKendaraan().printKendaraan();

        // Membuat Mata Kuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 2);

        // Menambahkan mata kuliah
        m1.addMatkul(mk1);
        m1.addMatkul(mk2);
        m1.addMatkul(mk3);

        // Menghitung jumlah SKS
        System.out.println("\nJumlah SKS: " + m1.getJumlahSKS());

        // Print detail mahasiswa
        System.out.println("\n===== DETAIL MAHASISWA =====");
        m1.printDetailMahasiswa();
    }
}
