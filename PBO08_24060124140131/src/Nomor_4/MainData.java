package Nomor_4;

// Nama File    : MainData.java
// Deskripsi    : program utama untuk menguji kelas generik Data menggunakan keluarga kelas Anabul.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

import Nomor_1.Anabul;
import Nomor_1.Anggora;
import Nomor_1.Anjing;
import Nomor_1.Burung;
import Nomor_1.Kembangtelon;
import Nomor_1.Kucing;

public class MainData {
    public static void main(String[] args) {
        Data<Anabul> dataAnabul = new Data<Anabul>();

        dataAnabul.setIsi(1, new Kucing("Miko", 4.2));
        dataAnabul.setIsi(2, new Anggora("Snowy", 3.8));
        dataAnabul.setIsi(3, new Kembangtelon("Telu", 4.5));
        dataAnabul.setIsi(4, new Anjing("Doggy"));
        dataAnabul.setIsi(5, new Burung("Rio"));

        System.out.println("Banyak data Anabul: " + dataAnabul.getSize());
        System.out.println();

        System.out.println("===== Isi Data Anabul =====");
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul anabul = dataAnabul.getIsi(i);
            System.out.println("Posisi ke-" + i + ": " + anabul);
            System.out.println(anabul.Gerak());
            System.out.println(anabul.Bersuara());
            System.out.println();
        }
    }
}
