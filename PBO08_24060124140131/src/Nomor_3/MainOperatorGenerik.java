package Nomor_3;

// Nama File    : MainOperatorGenerik.java
// Deskripsi    : program utama untuk menguji prosedur generik Tukar dan fungsi generik Bobot2.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

import Nomor_1.Anabul;
import Nomor_1.Anggora;
import Nomor_1.Anjing;
import Nomor_1.Kembangtelon;
import Nomor_1.Kucing;
import Nomor_2.Datum;

public class MainOperatorGenerik {
    public static void main(String[] args) {
        OperatorGenerik operator = new OperatorGenerik();

        Datum<Integer> angka1 = new Datum<Integer>(3);
        Datum<Integer> angka2 = new Datum<Integer>(6);

        System.out.println("===== Tukar Integer =====");
        System.out.println("Sebelum tukar: angka1 = " + angka1.getIsi() + ", angka2 = " + angka2.getIsi());
        operator.Tukar(angka1, angka2);
        System.out.println("Sesudah tukar: angka1 = " + angka1.getIsi() + ", angka2 = " + angka2.getIsi());
        System.out.println();

        Datum<String> kata1 = new Datum<String>("Merah");
        Datum<String> kata2 = new Datum<String>("Biru");

        System.out.println("===== Tukar String =====");
        System.out.println("Sebelum tukar: kata1 = " + kata1.getIsi() + ", kata2 = " + kata2.getIsi());
        operator.Tukar(kata1, kata2);
        System.out.println("Sesudah tukar: kata1 = " + kata1.getIsi() + ", kata2 = " + kata2.getIsi());
        System.out.println();

        Datum<Anabul> anabul1 = new Datum<Anabul>(new Anjing("Doggy"));
        Datum<Anabul> anabul2 = new Datum<Anabul>(new Kucing("Miko", 4.2));

        System.out.println("===== Tukar Anabul =====");
        System.out.println("Sebelum tukar: anabul1 = " + anabul1.getIsi() + ", anabul2 = " + anabul2.getIsi());
        operator.Tukar(anabul1, anabul2);
        System.out.println("Sesudah tukar: anabul1 = " + anabul1.getIsi() + ", anabul2 = " + anabul2.getIsi());
        System.out.println();

        Anggora anggora = new Anggora("Snowy", 3.8);
        Kembangtelon kembangtelon = new Kembangtelon("Telu", 4.5);

        System.out.println("===== Bobot2 Keturunan Kucing =====");
        System.out.println("Bobot " + anggora.getNama() + ": " + anggora.getBobot() + " kg");
        System.out.println("Bobot " + kembangtelon.getNama() + ": " + kembangtelon.getBobot() + " kg");
        System.out.println("Jumlah bobot: " + operator.Bobot2(anggora, kembangtelon) + " kg");
    }
}
