// Nama File    : App.java
// Deskripsi    : aplikasi untuk menguji penggunaan kelas Teman.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

import Nomor_1.Teman;

public class App {
    public static void main(String[] args) {
        Teman daftarTeman = new Teman();

        daftarTeman.addNama("Andi");
        daftarTeman.addNama("Budi");
        daftarTeman.addNama("Citra");
        daftarTeman.addNama("Budi");

        System.out.println("Daftar teman awal:");
        daftarTeman.showTeman();

        System.out.println("\nJumlah elemen: " + daftarTeman.getNbelm());
        System.out.println("Nama pada indeks ke-1: " + daftarTeman.getNama(1));

        daftarTeman.setNama(0, "Alya");
        System.out.println("\nSet nama indeks ke-0 menjadi Alya:");
        daftarTeman.showTeman();

        System.out.println("\nApakah Budi anggota list? " + daftarTeman.isMember("Budi"));
        System.out.println("Banyaknya nama Budi: " + daftarTeman.countNama("Budi"));

        daftarTeman.gantiNama("Citra", "Dina");
        System.out.println("\nGanti nama Citra menjadi Dina:");
        daftarTeman.showTeman();

        daftarTeman.delNama("Budi");
        System.out.println("\nHapus satu nama Budi:");
        daftarTeman.showTeman();

        System.out.println("\nJumlah elemen akhir: " + daftarTeman.getNbelm());
    }
}
