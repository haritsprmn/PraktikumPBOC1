package Nomor_3;

// Nama File    : MainAnabul.java
// Deskripsi    : program utama untuk menguji polimorfisme pada kelas Anabul dan turunannya.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 24/04/2026

public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] daftarAnabul = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul a : daftarAnabul) {
            System.out.println(a.Gerak());
            System.out.println(a.Bersuara());
            System.out.println();
        }
    }
}
