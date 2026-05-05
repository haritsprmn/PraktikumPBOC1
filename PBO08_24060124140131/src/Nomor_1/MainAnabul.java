package Nomor_1;

// Nama File    : MainAnabul.java
// Deskripsi    : program utama untuk menguji kelas Anabul, Kucing berbobot, Anggora, dan Kembangtelon.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

public class MainAnabul {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Miko", 4.2);
        Anggora anggora = new Anggora("Snowy", 3.8);
        Kembangtelon kembangtelon = new Kembangtelon("Telu", 4.5);

        System.out.println("===== Data Kucing =====");
        kucing.tampilData();
        System.out.println();

        System.out.println("===== Data Anggora =====");
        anggora.tampilData();
        System.out.println();

        System.out.println("===== Data Kembangtelon =====");
        kembangtelon.tampilData();
    }
}
