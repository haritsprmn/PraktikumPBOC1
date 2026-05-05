package Nomor_2;

// Nama File    : MainDatum.java
// Deskripsi    : program utama untuk menguji kelas generik Datum menggunakan keluarga kelas Anabul.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

import Nomor_1.Anabul;
import Nomor_1.Anggora;
import Nomor_1.Anjing;
import Nomor_1.Burung;
import Nomor_1.Kucing;

public class MainDatum {
    public static void main(String[] args) {
        Datum<Anabul> dataAnabul = new Datum<Anabul>();

        dataAnabul.setIsi(new Kucing("Miko", 4.2));
        System.out.println("Isi Datum: " + dataAnabul.getIsi());
        System.out.println(dataAnabul.getIsi().Gerak());
        System.out.println(dataAnabul.getIsi().Bersuara());
        System.out.println();

        dataAnabul.setIsi(new Anggora("Snowy", 3.8));
        System.out.println("Isi Datum setelah diganti: " + dataAnabul.getIsi());
        System.out.println(dataAnabul.getIsi().Gerak());
        System.out.println(dataAnabul.getIsi().Bersuara());
        System.out.println();

        dataAnabul.setIsi(new Anjing("Doggy"));
        System.out.println("Isi Datum setelah diganti: " + dataAnabul.getIsi());
        System.out.println(dataAnabul.getIsi().Gerak());
        System.out.println(dataAnabul.getIsi().Bersuara());
        System.out.println();

        dataAnabul.setIsi(new Burung("Rio"));
        System.out.println("Isi Datum setelah diganti: " + dataAnabul.getIsi());
        System.out.println(dataAnabul.getIsi().Gerak());
        System.out.println(dataAnabul.getIsi().Bersuara());
    }
}
